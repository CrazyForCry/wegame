package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.daos.RankTypeDao;
import com.dtos.ImageList;
import com.dtos.RankType;
import com.utils.JDBCUtil;

public class RankTypeDaoI implements RankTypeDao {

	@Override
	public List<RankType> getAll() throws SQLException {
		//��ȡ����
		Connection con = JDBCUtil.getConnect();
		//��������
		QueryRunner run = new QueryRunner();
		//����sql
		String sql = "select * from tab_rank_type";
		// BeanListHandler:���ص��Ǽ��� 
		//BeanHandler:���ص���һ����¼
		//ͨ��query,��ɲ�ѯ
		List<RankType> list = run.query(con,sql, 
				new BeanListHandler<RankType>(RankType.class));
		//�ر�����
		JDBCUtil.close(con);
		return list;
	}

	@Override
	public RankType getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RankType t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(RankType t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
