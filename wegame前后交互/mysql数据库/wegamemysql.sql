/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50540
Source Host           : 127.0.0.1:3306
Source Database       : web14

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2020-08-05 23:06:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hotspotnotice
-- ----------------------------
DROP TABLE IF EXISTS `hotspotnotice`;
CREATE TABLE `hotspotnotice` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `imgUrl` varchar(100) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `follow` varchar(100) DEFAULT NULL,
  `gameDetails` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hotspotnotice
-- ----------------------------
INSERT INTO `hotspotnotice` VALUES ('1', '#', 'images/oss_5eb64f699283a.jpg', '打造独立生态', '每日抽999Q币', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('2', '#', 'images/oss_5ebbee62dbc2c.jpg', '铁甲雄兵', '孙尚香皮肤宝箱上线', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('3', '#', 'images/oss_5ebd2f3a23fe3.jpg', '古剑奇谭网络版', '萤火祭换新衣', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('4', '#', 'images/oss_5ebd2fb29df80.jpg', '剑网3', '初夏盛典，商城上新', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('5', '#', 'images/oss_5ebe3a5912c8e.jpg', '穿越火线', '三亿鼠标的梦想', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('6', '#', 'images/oss_5ebba4e8ddd88.jpg', '剑灵', '领取特权福利', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('7', '#', 'images/oss_5ebdf69665566.jpg', '每日定时“猎首”开启', '血战到底？', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('8', '#', 'images/oss_5ebe6be54c88d.jpg', '武侠乂', '冠军5000元现金大奖', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('9', '#', 'images/oss_5eb8cd3dec334.jpg', '最终幻想14', '寻找FF系列的彩蛋', '关注', '游戏详情');
INSERT INTO `hotspotnotice` VALUES ('10', '#', 'images/oss_5ebfad1956b31.jpg', '三国杀', '限时领取豪礼', '关注', '游戏详情');

-- ----------------------------
-- Table structure for recentupdates
-- ----------------------------
DROP TABLE IF EXISTS `recentupdates`;
CREATE TABLE `recentupdates` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `bigImgUrl` varchar(255) DEFAULT NULL,
  `bigImg` varchar(255) DEFAULT NULL,
  `smallImgUrl` varchar(255) DEFAULT NULL,
  `smallImg` varchar(255) DEFAULT NULL,
  `gameName` varchar(255) DEFAULT NULL,
  `viewGame` varchar(255) DEFAULT NULL,
  `gameType` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `viewersNum` int(100) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recentupdates
-- ----------------------------
INSERT INTO `recentupdates` VALUES ('1', '#', 'images/360.png', '#', 'images/180.jpg', '幸福勇者', '查看游戏', '科幻 / FPS / 类Rogue', '紧急公告！！！', '致各位《幸福勇者》玩家及爱好者： 真是非常抱歉~大家，本次Aplha 26版本的更新，游戏出现了较', '668', '2020-05-17');
INSERT INTO `recentupdates` VALUES ('2', '#', 'images/360 (1).png', '#', 'images/180 (1).jpg', '克瑞因的纷争', '查看游戏', '独立游戏 / 二次元 / Roguelike', '紧急公告！！！', '紧急公告！！！\",\"Hello,亲爱的玩家朋友们，愉快的周末生活已经开始，你们现在是玩抖音或玩王者还是在无限活力呢？我们', '2223', '2020-05-16');
INSERT INTO `recentupdates` VALUES ('3', '#', 'images/360 (2).png', '#', 'images/180 (5).jpg', '铁甲雄兵', '查看游戏', '冷兵器 / 格斗游戏 / 动作冒险', '紧急公告！！！', '为保证游戏运行的稳定性，提升整体服务质量和体验，《铁甲雄兵》将于5月18日09:00~11:00进行.', '10499', '2020-05-15');

-- ----------------------------
-- Table structure for tab_details_active
-- ----------------------------
DROP TABLE IF EXISTS `tab_details_active`;
CREATE TABLE `tab_details_active` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `smallimg` varchar(100) DEFAULT NULL,
  `titlename` varchar(100) DEFAULT NULL,
  `descp` text,
  `num` int(11) DEFAULT NULL,
  `publishdate` datetime DEFAULT NULL,
  `activeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_details_active
-- ----------------------------
INSERT INTO `tab_details_active` VALUES ('1', 'images/240.png', '明日（04/23）07:00 全区全服 更新至Ver.412', '《龙之谷》 全区全服（除华东二） 于 04/23 07:00 开始进行 停机更新 至 Ver.412 版本，维护完成后我们会通过官网进行通知，请知晓并相互转告。', '12', '2020-04-22 22:19:42', '1');
INSERT INTO `tab_details_active` VALUES ('2', 'images/240 (1).png', '明日（03/19）07:00 全区全服 更新至Ver.407', '《龙之谷》 全区全服（除华东二） 于 明日 07:00 开始进行 停机更新 至 Ver.407 版本。维护完成后我们会通过官网进行通知，请知晓并相互转告。', '9', '2020-03-18 22:11:21', '1');
INSERT INTO `tab_details_active` VALUES ('3', 'images/240 (2).png', '明日（02/20）07:00 全区全服 更新至Ver.402', '《龙之谷》计划于 2020/02/20 07:00 开始对 全区全服（除华东二） 进行 版本更新至Ver.402 作业。', '31', '2020-02-19 22:58:29', '1');
INSERT INTO `tab_details_active` VALUES ('4', 'images/m1.png', '旧神归来：她卖贝壳更新现已发布', '在熟悉的大陆海岸线的远方，有东西正在等待着我们的冒险家们。你愿意为自己最珍惜的东西做些什么呢？', '631', '2020-05-06 10:29:26', '2');
INSERT INTO `tab_details_active` VALUES ('5', 'images/m2.png', '今天韦斯更新了吗？', '今天我们迎来了下一个人物更新！希望大家喜欢！', '447', '2020-05-03 10:31:18', '2');
INSERT INTO `tab_details_active` VALUES ('6', 'images/m3.png', '温蒂的人物重做已上线！', '发布了一个人物重做！还准备了一些新的皮肤，也想分享一下工作室的新闻和下次内容更新的小剧透！', '175', '2020-05-06 10:33:02', '2');

-- ----------------------------
-- Table structure for tab_hot_game
-- ----------------------------
DROP TABLE IF EXISTS `tab_hot_game`;
CREATE TABLE `tab_hot_game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gameImg` varchar(100) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `descp` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_hot_game
-- ----------------------------
INSERT INTO `tab_hot_game` VALUES ('1', 'images/oss_5eb64f699283a.jpg', '打造独立生态', '每日抽999Q币');
INSERT INTO `tab_hot_game` VALUES ('2', 'images/oss_5ebbee62dbc2c.jpg', '铁甲雄兵', '孙尚香皮肤宝箱上线');
INSERT INTO `tab_hot_game` VALUES ('3', 'images/oss_5ebd2f3a23fe3.jpg', '古剑奇谭网络版', '萤火祭换新衣');
INSERT INTO `tab_hot_game` VALUES ('4', 'images/oss_5ebd2fb29df80.jpg', '剑网3', '初夏盛典，商城上新');
INSERT INTO `tab_hot_game` VALUES ('5', 'images/oss_5ebe3a5912c8e.jpg', '穿越火线', '三亿鼠标的梦想');
INSERT INTO `tab_hot_game` VALUES ('6', 'images/oss_5ebba4e8ddd88.jpg', '剑灵', '领取特权福利');
INSERT INTO `tab_hot_game` VALUES ('7', 'images/oss_5ebdf69665566.jpg', '每日定时“猎首”开启', '血战到底？');
INSERT INTO `tab_hot_game` VALUES ('8', 'images/oss_5ebe6be54c88d.jpg', '武侠乂', '冠军5000元现金大奖');
INSERT INTO `tab_hot_game` VALUES ('9', 'images/oss_5eb8cd3dec334.jpg', '最终幻想14', '寻找FF系列的彩蛋');
INSERT INTO `tab_hot_game` VALUES ('10', 'images/oss_5ebfad1956b31.jpg', '三国杀', '限时领取豪礼');

-- ----------------------------
-- Table structure for tab_rank_smallimg
-- ----------------------------
DROP TABLE IF EXISTS `tab_rank_smallimg`;
CREATE TABLE `tab_rank_smallimg` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `typeInt` int(11) DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `smallImg` varchar(100) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `pay` varchar(50) DEFAULT NULL,
  `arrowtype` int(11) DEFAULT NULL,
  `arrowIcon` varchar(100) DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_rank_smallimg
-- ----------------------------
INSERT INTO `tab_rank_smallimg` VALUES ('1', '1', 'iconfont icon-cup', '0', 'images/142.jpg', '龙之谷', '免费', '0', '', '1');
INSERT INTO `tab_rank_smallimg` VALUES ('2', '2', null, '2', 'images/142 (1).jpg', '梦三国2', '免费', '1', 'iconfont icon-shangjiantou1 fr', '1');
INSERT INTO `tab_rank_smallimg` VALUES ('3', '2', null, '3', 'images/142 (2).jpg', '剑网3', '时长付费', '2', 'iconfont icon-xiajiantou fr', '1');
INSERT INTO `tab_rank_smallimg` VALUES ('4', '2', null, '4', 'images/142 (3).jpg', '真三国无双Online', '免费', '1', 'iconfont icon-shangjiantou1 fr', '1');
INSERT INTO `tab_rank_smallimg` VALUES ('5', '2', null, '5', 'images/142 (4).jpg', '古剑奇网络版', '时长付费', '2', 'iconfont icon-xiajiantou fr', '1');
INSERT INTO `tab_rank_smallimg` VALUES ('6', '2', null, '6', 'images/142 (5).jpg', '海战世界', '免费', '0', null, '1');
INSERT INTO `tab_rank_smallimg` VALUES ('7', '2', null, '7', 'images/142 (6).jpg', '坦克世界', '免费', '2', 'iconfont icon-xiajiantou fr', '1');
INSERT INTO `tab_rank_smallimg` VALUES ('8', '1', 'iconfont icon-cup', null, 'images/d78c5da98d6e22e653cea6be7b69485d.jpg', '饥荒：联机版', '&yen;24', '0', null, '2');
INSERT INTO `tab_rank_smallimg` VALUES ('9', '2', null, '2', 'images/142 (7).jpg', '恶果之地', '&yen;38', '0', null, '2');
INSERT INTO `tab_rank_smallimg` VALUES ('10', '2', null, '3', 'images/142 (8).jpg', '中国式家长', '&yen;36', '0', null, '2');
INSERT INTO `tab_rank_smallimg` VALUES ('11', '2', null, '4', 'images/142 (10).jpg', '打造世界', '&yen;18', '1', 'iconfont icon-shangjiantou1 fr', '2');
INSERT INTO `tab_rank_smallimg` VALUES ('12', '2', null, '5', 'images/142 (11).jpg', '捣蛋大作战', '&yen;18', '2', 'iconfont icon-xiajiantou fr', '2');
INSERT INTO `tab_rank_smallimg` VALUES ('13', '2', null, '6', 'images/142 (12).jpg', '星露谷物语', '&yen;48', '0', null, '2');
INSERT INTO `tab_rank_smallimg` VALUES ('14', '2', null, '7', 'images/142 (13).jpg', '饥荒：单机版', '&yen;24', '0', null, '2');
INSERT INTO `tab_rank_smallimg` VALUES ('15', '1', 'iconfont icon-yuan', null, 'images/142 (14).jpg', '捣蛋大作战', '2020-04-30上线', '0', null, '3');
INSERT INTO `tab_rank_smallimg` VALUES ('16', '1', 'iconfont icon-yuan1', null, 'images/142 (15).jpg', '奇奥英雄传', '2020-04-23上线', '0', null, '3');
INSERT INTO `tab_rank_smallimg` VALUES ('17', '1', 'iconfont icon-yuan1', null, 'images/142 (16).jpg', '无名之辈', '2020-04-21上线', '0', null, '3');
INSERT INTO `tab_rank_smallimg` VALUES ('18', '1', 'iconfont icon-yuan1', null, 'images/142 (17).jpg', '元能失控', '2020-04-21上线', '0', null, '3');
INSERT INTO `tab_rank_smallimg` VALUES ('19', '1', 'iconfont icon-yuan1', null, 'images/142 (18).jpg', '改变：一个小故事', '2020-04-17上线', '0', null, '3');
INSERT INTO `tab_rank_smallimg` VALUES ('20', '1', 'iconfont icon-yuan1', null, 'images/142 (19).jpg', '改变', '2020-04-17', '0', null, '3');
INSERT INTO `tab_rank_smallimg` VALUES ('21', '1', 'iconfont icon-yuan1', null, 'images/142 (20).jpg', '砖块迷宫建造者', '2020-04-16', '0', null, '3');

-- ----------------------------
-- Table structure for tab_rank_smallimg_details
-- ----------------------------
DROP TABLE IF EXISTS `tab_rank_smallimg_details`;
CREATE TABLE `tab_rank_smallimg_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(80) DEFAULT NULL,
  `videos` varchar(100) DEFAULT NULL,
  `details` text,
  `rankid` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `publishdate` date DEFAULT NULL,
  `smallimg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_rank_smallimg_details
-- ----------------------------
INSERT INTO `tab_rank_smallimg_details` VALUES ('1', '龙之谷', 'images/videos/1.mp4', '<p>《龙之谷》是一款由盛趣游戏运营的无锁定3D动作冒险游戏。</p>\r\n					<h4>全民大乱斗！《龙之谷》今日版本更新开启超嗨玩法</h4>\r\n					<p>《龙之谷》今日“全民大乱斗”版本更新，PVPVE大战玩法超嗨der，谁将用操作和策略独领风骚，在混战中脱颖而出？时空旋风“魂”玩法趣味回归，你将与杰哥、塔姐、铁匠等等中的哪一位完成灵魂共鸣，释放超酷能量？福利活动正在火爆进行中，记得上线，领取新版本福利！</p>\r\n					<a href=\"#\"><img src=\"images/1649db638f372479a2cbebccc2917b85.jpg\" alt=\"\"></a>\r\n					<h4>更究极的挑战！沙漠龙巢穴炼狱难度强势登场</h4>\r\n					<p>《龙之谷》今日更新后，沙漠龙巢穴炼狱难度登场！95级角色5至8人可入场，入场券为[残暴扎卡德之眼]。不过要提醒大家的是，本次沙漠龙巢穴是炼狱难度，相当于龙之秘境16层。每周可通关1次，中途奖励发放1次。通关后，有机会获得赞龙饰品、饰品进化之锤等重磅奖励。每一关有什么通关小技巧，BOSS们有什么难点技能？想要尽快熟悉机制，今晚19点，B站91233《龙之谷》官方直播间，舞谷丰登GM组合直播喂龙，送小淑的印记、水晶潘多拉之心、保护药等福利哦。新版本解析与福利齐飞，今晚19点，不见不散！</p>\r\n					<span class=\"u-hide\">\r\n					展开全部\r\n					</span>\r\n					<span class=\"iconfont icon-jiantou9\"></span>', '1', '0', '2020-05-05', 'images/142.jpg');
INSERT INTO `tab_rank_smallimg_details` VALUES ('2', '梦三国2', 'images/videos/2.mp4', '<p>《梦三国2》是一款由盛趣游戏运营的无锁定3D动作冒险游戏。</p>\r\n					<h4>全民大乱斗！《龙之谷》今日版本更新开启超嗨玩法</h4>\r\n					<p>《龙之谷》今日“全民大乱斗”版本更新，PVPVE大战玩法超嗨der，谁将用操作和策略独领风骚，在混战中脱颖而出？时空旋风“魂”玩法趣味回归，你将与杰哥、塔姐、铁匠等等中的哪一位完成灵魂共鸣，释放超酷能量？福利活动正在火爆进行中，记得上线，领取新版本福利！</p>\r\n					<a href=\"#\"><img src=\"images/1649db638f372479a2cbebccc2917b85.jpg\" alt=\"\"></a>\r\n					<h4>更究极的挑战！沙漠龙巢穴炼狱难度强势登场</h4>\r\n					<p>《龙之谷》今日更新后，沙漠龙巢穴炼狱难度登场！95级角色5至8人可入场，入场券为[残暴扎卡德之眼]。不过要提醒大家的是，本次沙漠龙巢穴是炼狱难度，相当于龙之秘境16层。每周可通关1次，中途奖励发放1次。通关后，有机会获得赞龙饰品、饰品进化之锤等重磅奖励。每一关有什么通关小技巧，BOSS们有什么难点技能？想要尽快熟悉机制，今晚19点，B站91233《龙之谷》官方直播间，舞谷丰登GM组合直播喂龙，送小淑的印记、水晶潘多拉之心、保护药等福利哦。新版本解析与福利齐飞，今晚19点，不见不散！</p>\r\n					<span class=\"u-hide\">\r\n					展开全部\r\n					</span>\r\n					<span class=\"iconfont icon-jiantou9\"></span>', '2', '0', '2020-05-06', 'images/142 (1).jpg');
INSERT INTO `tab_rank_smallimg_details` VALUES ('3', '剑网3', 'images/videos/3.mp4', '<p>《剑网3》是一款由盛趣游戏运营的无锁定3D动作冒险游戏。</p>\r\n					<h4>全民大乱斗！《龙之谷》今日版本更新开启超嗨玩法</h4>\r\n					<p>《龙之谷》今日“全民大乱斗”版本更新，PVPVE大战玩法超嗨der，谁将用操作和策略独领风骚，在混战中脱颖而出？时空旋风“魂”玩法趣味回归，你将与杰哥、塔姐、铁匠等等中的哪一位完成灵魂共鸣，释放超酷能量？福利活动正在火爆进行中，记得上线，领取新版本福利！</p>\r\n					<a href=\"#\"><img src=\"images/1649db638f372479a2cbebccc2917b85.jpg\" alt=\"\"></a>\r\n					<h4>更究极的挑战！沙漠龙巢穴炼狱难度强势登场</h4>\r\n					<p>《龙之谷》今日更新后，沙漠龙巢穴炼狱难度登场！95级角色5至8人可入场，入场券为[残暴扎卡德之眼]。不过要提醒大家的是，本次沙漠龙巢穴是炼狱难度，相当于龙之秘境16层。每周可通关1次，中途奖励发放1次。通关后，有机会获得赞龙饰品、饰品进化之锤等重磅奖励。每一关有什么通关小技巧，BOSS们有什么难点技能？想要尽快熟悉机制，今晚19点，B站91233《龙之谷》官方直播间，舞谷丰登GM组合直播喂龙，送小淑的印记、水晶潘多拉之心、保护药等福利哦。新版本解析与福利齐飞，今晚19点，不见不散！</p>\r\n					<span class=\"u-hide\">\r\n					展开全部\r\n					</span>\r\n					<span class=\"iconfont icon-jiantou9\"></span>', '3', '15', '2020-04-30', 'images/142 (2).jpg');
INSERT INTO `tab_rank_smallimg_details` VALUES ('4', '真三国无双Online', 'images/videos/4.mp4', '<p>《真三国无双Online》是一款由盛趣游戏运营的无锁定3D动作冒险游戏。</p><h4>全民大乱斗！《真三国无双Online》今日版本更新开启超嗨玩法</h4><p>《真三国无双Online》今日“全民大乱斗”版本更新，PVPVE大战玩法超嗨der，谁将用操作和策略独领风骚，在混战中脱颖而出？时空旋风“魂”玩法趣味回归，你将与杰哥、塔姐、铁匠等等中的哪一位完成灵魂共鸣，释放超酷能量？福利活动正在火爆进行中，记得上线，领取新版本福利！</p>\r\n<a href=\"#\"><img src=\"images/1649db638f372479a2cbebccc2917b85.jpg\" alt=\"\"></a><span class=\"u-hide\">展开全部</span><span clas=\"iconfont icon-jiantou9\"></span>', '4', '0', '2020-05-02', 'images/142 (3).jpg');
INSERT INTO `tab_rank_smallimg_details` VALUES ('5', '古剑奇网络版', 'images/videos/5.mp4', '<p>《古剑奇网络版》是一款由盛趣游戏运营的无锁定3D动作冒险游戏。</p>\r\n					<h4>全民大乱斗！《龙之谷》今日版本更新开启超嗨玩法</h4>\r\n					<p>《龙之谷》今日“全民大乱斗”版本更新，PVPVE大战玩法超嗨der，谁将用操作和策略独领风骚，在混战中脱颖而出？时空旋风“魂”玩法趣味回归，你将与杰哥、塔姐、铁匠等等中的哪一位完成灵魂共鸣，释放超酷能量？福利活动正在火爆进行中，记得上线，领取新版本福利！</p>\r\n					<a href=\"#\"><img src=\"images/1649db638f372479a2cbebccc2917b85.jpg\" alt=\"\"></a>\r\n					<h4>更究极的挑战！沙漠龙巢穴炼狱难度强势登场</h4>\r\n					<p>《龙之谷》今日更新后，沙漠龙巢穴炼狱难度登场！95级角色5至8人可入场，入场券为[残暴扎卡德之眼]。不过要提醒大家的是，本次沙漠龙巢穴是炼狱难度，相当于龙之秘境16层。每周可通关1次，中途奖励发放1次。通关后，有机会获得赞龙饰品、饰品进化之锤等重磅奖励。每一关有什么通关小技巧，BOSS们有什么难点技能？想要尽快熟悉机制，今晚19点，B站91233《龙之谷》官方直播间，舞谷丰登GM组合直播喂龙，送小淑的印记、水晶潘多拉之心、保护药等福利哦。新版本解析与福利齐飞，今晚19点，不见不散！</p>\r\n					<span class=\"u-hide\">\r\n					展开全部\r\n					</span>\r\n					<span class=\"iconfont icon-jiantou9\"></span>', '5', '22', '2020-05-03', 'images/142 (4).jpg');

-- ----------------------------
-- Table structure for tab_rank_type
-- ----------------------------
DROP TABLE IF EXISTS `tab_rank_type`;
CREATE TABLE `tab_rank_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `icon` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_rank_type
-- ----------------------------
INSERT INTO `tab_rank_type` VALUES ('1', '火爆商品', 'iconfont icon-iconset0143');
INSERT INTO `tab_rank_type` VALUES ('2', '本周热销', 'iconfont icon-iconset0143');
INSERT INTO `tab_rank_type` VALUES ('3', '新游上架', 'iconfont icon-iconset0143');

-- ----------------------------
-- Table structure for tab_update_info
-- ----------------------------
DROP TABLE IF EXISTS `tab_update_info`;
CREATE TABLE `tab_update_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bigimg` varchar(100) DEFAULT NULL,
  `smallimg` varchar(100) DEFAULT NULL,
  `title` varchar(50) DEFAULT NULL,
  `category` varchar(250) DEFAULT NULL,
  `info` varchar(50) DEFAULT NULL,
  `descp` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `infodate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_update_info
-- ----------------------------
INSERT INTO `tab_update_info` VALUES ('1', 'images/360.png', 'images/180.jpg', '幸福勇者', '>科幻 / FPS / 类Rogue', '紧急公告！！！', '致各位《幸福勇者》玩家及爱好者： 真是非常抱歉~大家，本次Aplha 26版本的更新，游戏出现了较', '668', '2020-05-17');
INSERT INTO `tab_update_info` VALUES ('2', 'images/360 (1).png', 'images/180 (1).jpg', '克瑞因的纷争', '独立游戏 / 二次元 / Roguelike', '克瑞因最新动向（六）', 'Hello,亲爱的玩家朋友们，愉快的周末生活已经开始，你们现在是玩抖音或玩王者还是在无限活力呢？我们.', '2223', '2020-05-16');
INSERT INTO `tab_update_info` VALUES ('3', 'images/360 (2).png', 'images/180 (5).jpg', '铁甲雄兵', '冷兵器 / 格斗游戏 / 动作冒险', '【公告】铁甲雄兵5月18日9:00停机维护', '为保证游戏运行的稳定性，提升整体服务质量和体验，《铁甲雄兵》将于5月18日09:00~11:00进行.', '10499', '2020-05-15');

-- ----------------------------
-- Table structure for tab_user
-- ----------------------------
DROP TABLE IF EXISTS `tab_user`;
CREATE TABLE `tab_user` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_user
-- ----------------------------
INSERT INTO `tab_user` VALUES ('1', 'admin', '123');
INSERT INTO `tab_user` VALUES ('2', 'user1', '123');
INSERT INTO `tab_user` VALUES ('3', 'user2', '123');
