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
		//�ҵ����е����
		List<RankType> list = rankTypeDao.getAll();
		//����������𣬽�ÿ������з�����Ϸ����
		for(int i=0;i<list.size();i++){
			//��ȡÿ�����
			RankType ranktype= list.get(i);
			//��ȡÿ������������Ϸ����
			List<RankSmallImg> listSon = rankSmallImgDao.queryByCid(ranktype.getId());
			//ÿ����������Ӧ����Ϸ����
			ranktype.setListrank(listSon);
		}
		return list;
	}
}
