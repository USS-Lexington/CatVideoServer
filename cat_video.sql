/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : cat_video

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2022-12-22 17:29:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(64) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('111', '333');
INSERT INTO `user` VALUES ('222', '333');
INSERT INTO `user` VALUES ('2222', '333');

-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `artist` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `video` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of videos
-- ----------------------------
INSERT INTO `videos` VALUES ('1', '你的名字', '新海诚', '(在肃反名单上)', 'http://120.55.79.207/images/450px-你的名字.cover.jpg', 'http://120.55.79.207/videos/0001.mp4');
INSERT INTO `videos` VALUES ('2', '天气之子', '新海诚', '上映于2019年', 'http://120.55.79.207/images/450px-天气之子.cover.jpg', 'http://120.55.79.207/videos/0002.mp4');
INSERT INTO `videos` VALUES ('3', '铃芽户缔', '新海诚', '上映于2022年', 'http://120.55.79.207/images/450px-铃芽户缔.cover.jpg', 'http://120.55.79.207/videos/0003.mp4');
INSERT INTO `videos` VALUES ('4', '测试测试', '张三', '明年年初', 'http://120.55.79.207/images/0004.jpg', 'http://120.55.79.207/videos/0004.mp4');
SET FOREIGN_KEY_CHECKS=1;
