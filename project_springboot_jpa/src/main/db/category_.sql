/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : 127.0.0.1:3306
 Source Schema         : how2java

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 29/09/2019 17:04:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category_
-- ----------------------------
DROP TABLE IF EXISTS `category_`;
CREATE TABLE `category_`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '分类信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of category_
-- ----------------------------
INSERT INTO `category_` VALUES (1, 'category 1');
INSERT INTO `category_` VALUES (2, 'category 2');
INSERT INTO `category_` VALUES (3, 'category 3');
INSERT INTO `category_` VALUES (4, 'category 4');

SET FOREIGN_KEY_CHECKS = 1;
