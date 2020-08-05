package com.daos.impls;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.daos.ImageListDao;
import com.dtos.ImageList;
import com.utils.JDBCUtil;



public class ImageListDaoI implements ImageListDao {

	@Override
	public List<ImageList> getAll() throws SQLException {
		//��ȡ����
		Connection con = JDBCUtil.getConnect();
		//��������
		QueryRunner run = new QueryRunner();
		//����sql
		String sql = "select * from tab_hot_game";
		// BeanListHandler:���ص��Ǽ��� 
		//BeanHandler:���ص���һ����¼
		//ͨ��query,��ɲ�ѯ
		List<ImageList> list = run.query(con,sql, 
				new BeanListHandler<ImageList>(ImageList.class));
		//�ر�����
		JDBCUtil.close(con);
		return list;
	}

	@Override
	public ImageList getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ImageList t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(ImageList t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
