package com.services;

import java.sql.SQLException;
import java.util.List;

import com.dtos.RankType;

public interface RankTypeModel {
	public List<RankType> list() throws SQLException;
}
