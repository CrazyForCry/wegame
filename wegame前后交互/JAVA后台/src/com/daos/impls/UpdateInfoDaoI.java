package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.daos.UpdateInfoDao;

import com.dtos.Updateinfo;
import com.utils.JDBCUtil;

public class UpdateInfoDaoI implements UpdateInfoDao {

	@Override
	public List<Updateinfo> getAll() throws SQLException {
		//��ȡ����
		Connection con = JDBCUtil.getConnect();
		//��������
		QueryRunner run = new QueryRunner();
		//����sql
		String sql = "select * from tab_update_info";
		// BeanListHandler:���ص��Ǽ��� 
		//BeanHandler:���ص���һ����¼
		//ͨ��query,��ɲ�ѯ
		List<Updateinfo> list = run.query(con,sql, 
				new BeanListHandler<Updateinfo>(Updateinfo.class));
		//�ر�����
		JDBCUtil.close(con);
		return list;
	}

	@Override
	public Updateinfo getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Updateinfo t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(Updateinfo t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
