package cn.vpclub.javabasic.review.array;

import java.util.Arrays;

/**
 * <p>
 * Java基础回顾——数组
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/25 15:15
 */
public class Array {

    /**
     * 技巧：1.数组是一个固定长度的，包含了相同类型数据的容器
     *      2.数组遍历时利用增强型for循环时会更加快捷，但增强型for循环只能用来取值，却不能用修改数组里的值
     *     3.数组的长度是不可变的，一旦分配好空间，是多长，就多长，无法改变，但可以用System.arraycopy(src：原数组, srcPos：从原数组复制数据的起始位置, dest：目标数组, destPos：复制到目标数组的起始位置, length复制的长度)
     */
    public static void main(String[] args) {
        //声明一个长度为5的数组
        int[] a = new int[5];
        //给数组的每一位赋予随机整数
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println("\n 数组中各个随机整数为：" + a[i]);
        }

        //利用for循环逐个比较值从而找出最小值
        //初始化赋值最小值变量min
        int min = a[0];
        for (int i : a) {
            if (i < min) {
                System.out.println("\n 数组中最小随机整数为：" + min);
            }
        }

        //利用Arrays工具类排序从而找出最小值
        Arrays.sort(a);
        System.out.println("\n 数组中最小随机整数为：" + a[0]);
        System.out.println("-------------------------------");


        //利用for循环反转数组
        //声明一个数组
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            //反转赋值
            b[a.length - i - 1] = a[i];
            System.out.println("\n 原始数组中各个随机整数为：" + a[i]);
        }
        System.out.println("----------------------------------------");
        for (int i = 0; i < b.length; i++) {
            System.out.println("\n 反转数组中各个随机整数为：" + b[i]);
        }

        System.out.println("---------------------------------------");
        //利用System.arrayCopy合并两个数组
        //声明一个长度为4的数组
        int[] c = new int[4];
        //给数组的每一位赋予随机整数
        c[0] = (int) (Math.random() * 100);
        c[1] = (int) (Math.random() * 100);
        c[2] = (int) (Math.random() * 100);
        c[3] = (int) (Math.random() * 100);
        //声明一个合并接收数组，其长度都数组a,c的和，防止下标越界
        int[] d = new int[9];
        //合并数组
        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(c, 0, d, a.length, c.length);
        //遍历数组
        for (int i : d) {
            System.out.println("\n 数组a,c合并后的数组元素为：" + i);

        }
        System.out.println("----------------------------------");

        //定义一个5x5的二维数组
        int[][] e = new int[5][5];
        //利用随机整数填充二维数组
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                e[i][j] = (int) (Math.random() * 100);
                System.out.print(e[i][j] + "\t\t");
            }
            System.out.println();
        }
        //找出二维数组中最大的数据
        //初始化二维数组中最大值
        int max = e[0][0], x = 0, y = 0;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                if (e[i][j] > max) {
                    max = e[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println("二维数组中最大值为：" + max + "其坐标为[" + x + "," + y + "]");
        System.out.println("--------------------------------------------------------------");


        //java.util.Arrays 工具类的使用
        //方法1：copyOfRange(int[] original：源数组, int from：开始位置, int to：结束位置(包含开始不包含结束))
        //方法2：toString() 将一个数组装换为字符串
        //方法3：Sort() 排序数组
        //方法4：binarySearch()查询数组中的元素位置，但必须先进行排序，且数组中有多个相同元素，查询的结果是不确定的
        //方法5：equal()比较两个数组内容是否相同
        //方法6：fill()使用同一数据，填充数组

        //声明一个长度为6 的数组
        int[] f = new int[]{18, 62, 68, 82, 65, 9};
        //复制数组
        int[] copy = Arrays.copyOfRange(f, 0, 3);
        //遍历数组
        for (int i : copy) {
            System.out.println("利用copyOfRange方法复制的数组为：" + i);
        }
        System.out.println("---------------------------------------------");
        System.out.println("利用toString()打印数组：" + Arrays.toString(f));

        System.out.println("---------------------------------------------");
        //排序数组
        Arrays.sort(f);
        System.out.println("利用sort()排序数组：" + Arrays.toString(f));

        System.out.println("--------------------------------------------");
        //排序数组
        Arrays.sort(f);
        //查询数组
        System.out.println("利用binarySearch()查询数组:" + Arrays.binarySearch(f, 62));

        System.out.println("--------------------------------------------");
        //定义两个个长度为6的数组
        int[] g = new int[]{18, 62, 68, 82, 65, 9};
        int[] h = new int[]{18, 62, 68, 82, 65, 8};
        System.out.println("利用equal()比较数组" + Arrays.equals(g, h));

        System.out.println("----------------------------------------");
        int[] i = new int[10];
        Arrays.fill(i, 5);
        System.out.println("利用fill()填充数组" + Arrays.toString(i));


    }
}
