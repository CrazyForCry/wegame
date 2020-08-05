package com.daos;

import java.sql.SQLException;

import com.dtos.RankDetails;

public interface RankDetailsDao extends BaseDao<RankDetails> {
	//根据外键rankid(是ranksmall的主键，rankid:外键（在另外一张表是主键）)找到详情表的相应信息
	public RankDetails queryByRankId(int id) throws SQLException;
}
