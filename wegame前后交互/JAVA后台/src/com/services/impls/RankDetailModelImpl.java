package com.services.impls;


import java.sql.SQLException;
import java.util.List;

import com.daos.RankDetailsActiveDao;
import com.daos.RankDetailsDao;
import com.daos.impls.RankDetailsActiveDaoI;
import com.daos.impls.RankDetailsDaoI;
import com.dtos.RankDetails;
import com.dtos.RankDetailsActive;
import com.services.RankDetailModel;

public class RankDetailModelImpl implements RankDetailModel {
	
	private RankDetailsDao  rankDetailsDao = new RankDetailsDaoI();
	private RankDetailsActiveDao  rankDetailsActiveDao = new RankDetailsActiveDaoI();
	@Override
	public RankDetails getDetail(int id) throws SQLException {
		//�Ⱥ�ȥ�������Ϣ
		RankDetails detail = rankDetailsDao.queryByRankId(id);
		//��ȡ�����еĻ�б�
		List<RankDetailsActive> list =
				rankDetailsActiveDao.queryByActiveId(detail.getId());
		detail.setActiveList(list);		
		return detail;
	}

}
