package com.lj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   // ������Ӧ��������
		resp.setContentType("text/html");

		   // ʵ�ʵ��߼���������
		//   PrintWriter out = response.getWriter();
		//   out.println("<h1>" + message + "</h1>");
		   
		req.getRequestDispatcher("index.jsp").forward(req,resp);
	}

}
