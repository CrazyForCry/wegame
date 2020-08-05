package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.daos.RankDetailsActiveDao;

import com.dtos.RankDetailsActive;
import com.utils.JDBCUtil;

public class RankDetailsActiveDaoI implements RankDetailsActiveDao {

	@Override
	public List<RankDetailsActive> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RankDetailsActive getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RankDetailsActive t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(RankDetailsActive t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RankDetailsActive> queryByActiveId(int id) throws SQLException {
		Connection con = JDBCUtil.getConnect();
		QueryRunner run = new QueryRunner();
		String sql = "select * from tab_details_active where activeid=?";
		
		List<RankDetailsActive> list =run.query(con, sql, 
				new BeanListHandler<RankDetailsActive>(RankDetailsActive.class),id);
		JDBCUtil.close(con);
		return list;
	}

}
