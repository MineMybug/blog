DROP DATABASE IF EXISTS db_blog;
/*�������ݿ⣬�����ñ���*/
CREATE DATABASE db_blog DEFAULT CHARACTER SET utf8;

USE db_blog;

CREATE TABLE `t_blogger` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '����id',
  `username` VARCHAR(50) NOT NULL COMMENT '��������',
  `password` VARCHAR(100) NOT NULL COMMENT '��������',
  `profile` TEXT COMMENT '������Ϣ',
  `nickname` VARCHAR(50) DEFAULT NULL COMMENT '�����ǳ�',
  `sign` VARCHAR(100) DEFAULT NULL COMMENT '����ǩ��',
  `imagename` VARCHAR(100) DEFAULT NULL COMMENT '����ͷ��·��',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `t_user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '����id',
	`username` VARCHAR(50) NOT NULL COMMENT '��������',
)ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;