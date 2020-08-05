package com.daos;


import java.sql.SQLException;
import java.util.List;


import com.dtos.RankDetailsActive;

public interface RankDetailsActiveDao extends BaseDao<RankDetailsActive> {
	//¸ù¾ÝÍâ¼üactiveid
	public List<RankDetailsActive> queryByActiveId(int id) throws SQLException;
}

