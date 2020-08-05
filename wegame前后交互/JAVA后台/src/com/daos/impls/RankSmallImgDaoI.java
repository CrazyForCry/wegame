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
		//��ȡ����
		Connection con = JDBCUtil.getConnect();
		//��������
		QueryRunner run = new QueryRunner();
		//����sql
		String sql = "select * from tab_rank_smallimg where cid = ?";
		// BeanListHandler:���ص��Ǽ��� 
		//BeanHandler:���ص���һ����¼
		//ͨ��query,��ɲ�ѯ
		List<RankSmallImg> list = run.query(con,sql, 
				new BeanListHandler<RankSmallImg>(RankSmallImg.class),cid);
		//�ر�����
		JDBCUtil.close(con);
		return list;
	}

}
