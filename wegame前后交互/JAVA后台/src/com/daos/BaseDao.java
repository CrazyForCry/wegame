package com.daos;

import java.sql.SQLException;
import java.util.List;
//������
public interface BaseDao<T> {
	//��ʾ���е���Ϣ
	public List<T> getAll() throws SQLException;
	//���ݱ�Ų�ѯ��Ϣ
	public T getOne(int id) throws SQLException;
	//ɾ����Ϣ
	public int deleteById(int id) throws SQLException;
	//������Ϣ
	public int update(T t) throws SQLException;
	//�����Ϣ
	public int add(T t) throws SQLException;
}
