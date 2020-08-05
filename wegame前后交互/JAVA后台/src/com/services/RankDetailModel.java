package com.services;

import java.sql.SQLException;

import com.dtos.RankDetails;

public interface RankDetailModel {
	//返回详情页面中的详情信息，以及该详情信息的活动列表
	public RankDetails getDetail(int id) throws SQLException;
}
