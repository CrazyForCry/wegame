package com.daos;


import java.sql.SQLException;
import java.util.List;


import com.dtos.RankDetailsActive;

public interface RankDetailsActiveDao extends BaseDao<RankDetailsActive> {
	//�������activeid
	public List<RankDetailsActive> queryByActiveId(int id) throws SQLException;
}

