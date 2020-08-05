package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/f1")
//http://localhost:8080/web141/f1
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
//		out.println("<p>�ļ�1</p>");
//		//��һ�η��ʣ����û��session:����һ��session
		HttpSession session = request.getSession();
//		session.setAttribute("name", "wanhe");
//		out.println("<p><a href='s1'>�ļ�2</a></p>");
		//���ж���û����Ʒ
		String goodsList = (String)session.getAttribute("shopcar");
		if(null == goodsList){
			session.setAttribute("shopcar", "");
		}
		String msg = (String)session.getAttribute("shopcar");
		String newMsg = msg + request.getParameter("goods")+",";
		session.setAttribute("shopcar", newMsg);
		
		response.sendRedirect("shop3.jsp");
		
//		request.getRequestDispatcher("s1").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
