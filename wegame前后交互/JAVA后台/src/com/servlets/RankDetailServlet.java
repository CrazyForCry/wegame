package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.dtos.RankDetails;
import com.services.RankDetailModel;
import com.services.impls.RankDetailModelImpl;

/**
 * Servlet implementation class RankDetailServlet
 */
@WebServlet("/rankdetail")
public class RankDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		RankDetailModel model =new RankDetailModelImpl();
		String sid = request.getParameter("id");
		//将字符串id转化为整形
		int id = Integer.parseInt(sid);
		try {
			RankDetails detail = model.getDetail(id);
			String msg = JSON.toJSONString(detail);
			out.println(msg);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
