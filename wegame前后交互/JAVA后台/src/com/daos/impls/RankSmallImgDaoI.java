package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.daos.RankSmallImgDao;
import com.dtos.RankSmallImg;
import com.utils.JDBCUtil;

public class RankSmallImgDaoI implements RankSmallImgDao {

	@Override
	public List<RankSmallImg> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RankSmallImg getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RankSmallImg t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(RankSmallImg t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RankSmallImg> queryByCid(int cid) throws SQLException {
		//获取连接
		Connection con = JDBCUtil.getConnect();
		//创建对象
		QueryRunner run = new QueryRunner();
		//建立sql
		String sql = "select * from tab_rank_smallimg where cid = ?";
		// BeanListHandler:返回的是集合 
		//BeanHandler:返回的是一条记录
		//通过query,完成查询
		List<RankSmallImg> list = run.query(con,sql, 
				new BeanListHandler<RankSmallImg>(RankSmallImg.class),cid);
		//关闭连接
		JDBCUtil.close(con);
		return list;
	}

}
