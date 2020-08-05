package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.daos.RankDetailsDao;
import com.dtos.RankDetails;
import com.utils.JDBCUtil;

public class RankDetailsDaoI implements RankDetailsDao{

	@Override
	public List<RankDetails> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RankDetails getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RankDetails t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(RankDetails t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RankDetails queryByRankId(int id) throws SQLException {
		Connection con = JDBCUtil.getConnect();
		QueryRunner run = new QueryRunner();
		String sql = "select * from tab_rank_smallimg_details where rankid=?";
		RankDetails detail =run.query(con, sql, 
				new BeanHandler<RankDetails>(RankDetails.class),id);
		JDBCUtil.close(con);
		return detail;
	}

}
