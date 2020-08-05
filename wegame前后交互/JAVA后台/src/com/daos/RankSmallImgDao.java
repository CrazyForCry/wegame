package com.daos;

import java.sql.SQLException;
import java.util.List;

import com.dtos.RankSmallImg;

public interface RankSmallImgDao extends BaseDao<RankSmallImg> {
	//根据类别编号查找游戏内容
	public List<RankSmallImg> queryByCid(int cid) throws SQLException;

}
