package com.daos;

import java.sql.SQLException;
import java.util.List;

import com.dtos.RankSmallImg;

public interface RankSmallImgDao extends BaseDao<RankSmallImg> {
	//��������Ų�����Ϸ����
	public List<RankSmallImg> queryByCid(int cid) throws SQLException;

}
