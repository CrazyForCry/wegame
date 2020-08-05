package com.services.impls;

import java.sql.SQLException;
import java.util.List;

import com.daos.RankSmallImgDao;
import com.daos.RankTypeDao;
import com.daos.impls.RankSmallImgDaoI;
import com.daos.impls.RankTypeDaoI;
import com.dtos.RankSmallImg;
import com.dtos.RankType;
import com.services.RankTypeModel;

public class RankTypeModelImpl implements RankTypeModel{
	private RankTypeDao rankTypeDao = new RankTypeDaoI();
	private RankSmallImgDao rankSmallImgDao = new RankSmallImgDaoI();
	@Override
	public List<RankType> list() throws SQLException {
		//找到所有的类别
		List<RankType> list = rankTypeDao.getAll();
		//遍历所有类别，将每个类别中放入游戏内容
		for(int i=0;i<list.size();i++){
			//获取每个类别
			RankType ranktype= list.get(i);
			//获取每个类别下面的游戏内容
			List<RankSmallImg> listSon = rankSmallImgDao.queryByCid(ranktype.getId());
			//每个类别添加相应的游戏内容
			ranktype.setListrank(listSon);
		}
		return list;
	}
}
