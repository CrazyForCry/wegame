package com.daos;

import java.sql.SQLException;

import com.dtos.RankDetails;

public interface RankDetailsDao extends BaseDao<RankDetails> {
	//�������rankid(��ranksmall��������rankid:�����������һ�ű���������)�ҵ���������Ӧ��Ϣ
	public RankDetails queryByRankId(int id) throws SQLException;
}
