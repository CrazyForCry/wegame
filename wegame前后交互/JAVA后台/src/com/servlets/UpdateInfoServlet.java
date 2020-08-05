package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.daos.UpdateInfoDao;
import com.daos.impls.UpdateInfoDaoI;
import com.dtos.ImageList;
import com.dtos.Updateinfo;


@WebServlet("/updateinfo")
public class UpdateInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");		
		PrintWriter out = response.getWriter();
		String callback = request.getParameter("callback");
		UpdateInfoDao updateInfoDao = new UpdateInfoDaoI();
		
		try {
			List<Updateinfo> list = updateInfoDao.getAll();
			String msg = JSON.toJSONString(list);
			out.println(callback+"("+msg+")");
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
