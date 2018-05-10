-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.43 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 cuckoo 的数据库结构
DROP DATABASE IF EXISTS `cuckoo`;
CREATE DATABASE IF NOT EXISTS `cuckoo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cuckoo`;

-- 导出  表 cuckoo.order 结构
DROP TABLE IF EXISTS `order`;
CREATE TABLE IF NOT EXISTS `order` (
  `id` int(20) NOT NULL,
  `user_id` INT(11) NOT NULL DEFAULT '0' COMMENT '用户id',
  `product_name` varchar(100) NOT NULL COMMENT '商品名称',
  `status` tinyint(4) NOT NULL DEFAULT 1 COMMENT '0:表示无效.1:表示有效',
  `crt_time` datetime NOT NULL DEFAULT current_timestamp(),
  `creator` varchar(40) NOT NULL DEFAULT '',
  `mod_time` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `modifier` varchar(40) DEFAULT '',
  `comment` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- 数据导出被取消选择。
-- 导出  表 cuckoo.user 结构
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL COMMENT '用户名，用于登录',
  `realname` varchar(50) NOT NULL COMMENT '用户真实名',
  `email` VARCHAR(96) COMMENT '邮箱',
  `crt_time` datetime NOT NULL DEFAULT current_timestamp(),
  `creator` varchar(40) NOT NULL DEFAULT '',
  `mod_time` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `modifier` varchar(40) DEFAULT '',
  `comment` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
