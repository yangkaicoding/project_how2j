package cn.vpclub.how2j.springboot.upload.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * <p>
 * SpringBoot文件上传 前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/10/15 11:05
 */
@Controller
public class UploadController {

    @RequestMapping("/uploadPage")
    public String uploadPage() { return "uploadPage"; }

    /**
     * 文件上传
     *
     * @param request
     * @param file
     * @param m
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request, @RequestParam("file") MultipartFile file, Model m) {
        try {
            //根据当前时间戳创建新的文件名，防止多次上传相同名称文件，将第一次上传的文件覆盖
            String fileName = System.currentTimeMillis() + file.getOriginalFilename();
            //获取当前项目的真实路径，然后与前面的文件名进行拼接
            String destFileName = request.getServletContext().getRealPath("") + "upload" + File.separator + fileName;
            //第一次运行时，文件所在的目录往往是不存在的，这里需要创建目录
            File destFile = new File(destFileName);
            destFile.getParentFile().mkdir();
            //将浏览器上上传的文件复制到指定的位置
            file.transferTo(destFile);
            //将文件名放在model里，以便于后续显示使用
            m.addAttribute("fileName", fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "文件上传失败" + e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "文件上传失败" + e.getMessage();
        }
        return "showImage";
    }

}
