package com.lj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��չ HttpServlet ��
//@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {

private String message;

public void init() throws ServletException
{
   // ִ�б���ĳ�ʼ��
   message = "sddddddddddddd";
}

public void doGet(HttpServletRequest request,
                 HttpServletResponse response)
         throws ServletException, IOException
{
   // ������Ӧ��������
   response.setContentType("text/html");

   // ʵ�ʵ��߼���������
//   PrintWriter out = response.getWriter();
//   out.println("<h1>" + message + "</h1>");
   
   
   
   
//   response.sendRedirect("jsp/success.jsp");
   request.getRequestDispatcher("jsp/success.jsp").forward(request,response);
   
//   
   
   
}

}