package com.daos;

import java.sql.SQLException;

import com.dtos.User;

public interface UserDao extends BaseDao<User> {
	//登录
	public User login(User user) throws SQLException;
	//验证用户名是否已经存在
	public boolean getName(String name) throws SQLException;
}
