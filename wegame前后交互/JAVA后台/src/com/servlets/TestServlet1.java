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
	
	//�����û���get�������û����ȷָ���ύ��ʽ���󲿷ֶ���get����Ĭ���� get����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		//���ݱ�Ԫ�ص�name, ��ȡ�û������ֵ
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		//�������ݿ�
//		
//		if(name.equals("admin")&&pass.equals("123")){
//			//��ͻ�������Ϣ
//			out.println("��¼�ɹ���");
//			//�ض��򣺲��ܴ�����
//			response.sendRedirect("index.jsp");
//			//��uname��ֵ
//			HttpSession session = request.getSession();
//			session.setAttribute("uname", name);
//			List<User> userList = new ArrayList<User>();
//			userList.add(new User(1,"admin","��",8000));
//			userList.add(new User(2,"user1","��",18000));
//			userList.add(new User(3,"user2","Ů",12000));
//			request.setAttribute("list", userList);
//			//ҳ��ת��
//			request.getRequestDispatcher("index.jsp").forward(request, response);
//		}else{
//			out.println("��¼ʧ��");
//		}
	}

	//����post����
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
