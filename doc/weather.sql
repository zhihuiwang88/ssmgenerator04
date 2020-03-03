/*
Navicat MySQL Data Transfer

Source Server         : gongan
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : weather

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2020-03-02 20:18:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for weather_future
-- ----------------------------
DROP TABLE IF EXISTS `weather_future`;
CREATE TABLE `weather_future` (
  `future_id` int(32) NOT NULL AUTO_INCREMENT,
  `temperature` varchar(32) DEFAULT NULL COMMENT '26℃~33℃',
  `weather` varchar(32) DEFAULT NULL COMMENT '多云',
  `wind` varchar(32) DEFAULT NULL COMMENT '北风4-5级',
  `week` varchar(32) DEFAULT NULL COMMENT '星期六',
  `date` varchar(32) DEFAULT NULL COMMENT '20140809',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`future_id`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for weather_id
-- ----------------------------
DROP TABLE IF EXISTS `weather_id`;
CREATE TABLE `weather_id` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `today_fa` varchar(16) DEFAULT NULL,
  `today_fb` varchar(16) DEFAULT NULL,
  `future_fa` varchar(16) DEFAULT NULL,
  `future_fb` varchar(16) DEFAULT NULL,
  `fa` varchar(16) DEFAULT NULL,
  `fb` varchar(16) DEFAULT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for weather_sk
-- ----------------------------
DROP TABLE IF EXISTS `weather_sk`;
CREATE TABLE `weather_sk` (
  `sk_id` int(16) NOT NULL AUTO_INCREMENT,
  `temp` varchar(16) DEFAULT NULL COMMENT '当前温度',
  `wind_direction` varchar(16) DEFAULT NULL COMMENT '当前风向',
  `wind_strength` varchar(16) DEFAULT NULL COMMENT '当前风力',
  `humidity` varchar(16) DEFAULT NULL COMMENT '当前湿度',
  `time` varchar(32) DEFAULT NULL COMMENT '当前时间14:36',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`sk_id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COMMENT='当前实况天气';

-- ----------------------------
-- Table structure for weather_today
-- ----------------------------
DROP TABLE IF EXISTS `weather_today`;
CREATE TABLE `weather_today` (
  `today_id` int(64) NOT NULL AUTO_INCREMENT,
  `city` varchar(32) DEFAULT NULL COMMENT '城市',
  `date_y` varchar(128) DEFAULT '' COMMENT '当前日期2014年8月16日',
  `week` varchar(16) DEFAULT NULL COMMENT '星期几',
  `temperature` varchar(64) DEFAULT NULL COMMENT '今日温度',
  `weather` varchar(32) DEFAULT NULL COMMENT '今日天气',
  `wind` varchar(16) DEFAULT NULL COMMENT '西南风微风',
  `dressing_index` varchar(16) DEFAULT NULL COMMENT '穿衣指数',
  `dressing_advice` varchar(128) DEFAULT NULL COMMENT '穿衣建议',
  `uv_index` varchar(16) DEFAULT NULL COMMENT '紫外线强度',
  `comfort_index` varchar(16) DEFAULT NULL COMMENT '舒适度指数',
  `wash_index` varchar(16) DEFAULT NULL COMMENT '洗车指数',
  `travel_index` varchar(16) DEFAULT NULL COMMENT '旅游指数',
  `exercise_index` varchar(16) DEFAULT NULL COMMENT '晨练指数',
  `drying_index` varchar(16) DEFAULT NULL COMMENT '干燥指数',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`today_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COMMENT='今日天气状况';
