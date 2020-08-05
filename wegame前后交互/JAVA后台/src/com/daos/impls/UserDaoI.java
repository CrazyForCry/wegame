package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.daos.UserDao;
import com.dtos.User;
import com.utils.JDBCUtil;

public class UserDaoI implements UserDao {

	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(User t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User login(User user) throws SQLException {
		Connection  con = JDBCUtil.getConnect();
		QueryRunner run =new QueryRunner();
		String sql = "select * from tab_user where name = ? and pass = ?";
		User userinfo =run.query(con,sql, 
				new BeanHandler<User>(User.class),user.getName(),user.getPass());
		JDBCUtil.close(con);
		return userinfo;
		
	}

	@Override
	public boolean getName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
