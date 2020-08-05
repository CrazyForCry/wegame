package com.daos;

import java.sql.SQLException;
import java.util.List;
//泛型类
public interface BaseDao<T> {
	//显示所有的信息
	public List<T> getAll() throws SQLException;
	//根据编号查询信息
	public T getOne(int id) throws SQLException;
	//删除信息
	public int deleteById(int id) throws SQLException;
	//更新信息
	public int update(T t) throws SQLException;
	//添加信息
	public int add(T t) throws SQLException;
}
