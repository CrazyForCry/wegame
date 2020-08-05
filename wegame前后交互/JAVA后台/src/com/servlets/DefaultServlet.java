package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.daos.ImageListDao;
import com.daos.impls.ImageListDaoI;
import com.dtos.ImageList;
import com.dtos.RankSmallImg;
import com.dtos.RankType;
import com.services.RankTypeModel;
import com.services.impls.RankTypeModelImpl;

@WebServlet("/default")
public class DefaultServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		
		response.setHeader("Access-Control-Allow-Origin","*");
		PrintWriter out = response.getWriter();
		String act = request.getParameter("action");
		try {
			if("listimg".equals(act)){
				ImageListDao imgDao = new ImageListDaoI();
				List<ImageList> list = imgDao.getAll();
				String msg = JSON.toJSONString(list);
				out.println(msg);			
			}else if("listrank".equals(act)){
				RankTypeModel rankTypeModel = new RankTypeModelImpl();
				List<RankType> rankList = rankTypeModel.list();
				String msg = JSON.toJSONString(rankList);
				out.println(msg);
			}		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
