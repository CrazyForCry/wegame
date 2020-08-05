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
import com.daos.UserDao;
import com.daos.impls.UserDaoI;
import com.dtos.User;
import com.utils.Result;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");		
		response.setHeader("Access-Control-Allow-Origin","*");
		PrintWriter out = response.getWriter();
		UserDao userDao =new UserDaoI();
		//前端传来用户名和密码
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		User u1 = new User(name,pass);
		//从数据库中的用户表中查询用户信息
		Result result=null;
		try { 
			User newUser = userDao.login(u1);
			
			if (newUser!=null) {
				 result = new Result(0, newUser,"登录成功");
			}else{
				 result = new Result(-1,"登录失败");
			}
			String msg = JSON.toJSONString(result);
			out.println(msg);
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
