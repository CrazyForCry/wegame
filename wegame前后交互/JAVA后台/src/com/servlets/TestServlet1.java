package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dtos.User;

@WebServlet("/test1")
//http://localhost:8080/web141/test1
public class TestServlet1 extends HttpServlet {
	
	//处理用户的get请求：如果没有明确指定提交方式，大部分都是get请求，默认是 get请求
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//根据表单元素的name, 获取用户输入的值
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		//调用数据库
//		
//		if(name.equals("admin")&&pass.equals("123")){
//			//向客户发送信息
//			out.println("登录成功！");
//			//重定向：不能带参数
//			response.sendRedirect("index.jsp");
//			//给uname赋值
//			HttpSession session = request.getSession();
//			session.setAttribute("uname", name);
//			List<User> userList = new ArrayList<User>();
//			userList.add(new User(1,"admin","男",8000));
//			userList.add(new User(2,"user1","男",18000));
//			userList.add(new User(3,"user2","女",12000));
//			request.setAttribute("list", userList);
//			//页面转向
//			request.getRequestDispatcher("index.jsp").forward(request, response);
//		}else{
//			out.println("登录失败");
//		}
	}

	//处理post请求
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
