package com.daos;

import java.sql.SQLException;

import com.dtos.User;

public interface UserDao extends BaseDao<User> {
	//��¼
	public User login(User user) throws SQLException;
	//��֤�û����Ƿ��Ѿ�����
	public boolean getName(String name) throws SQLException;
}
