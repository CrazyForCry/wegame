package com.services;

import java.sql.SQLException;

import com.dtos.RankDetails;

public interface RankDetailModel {
	//��������ҳ���е�������Ϣ���Լ���������Ϣ�Ļ�б�
	public RankDetails getDetail(int id) throws SQLException;
}
