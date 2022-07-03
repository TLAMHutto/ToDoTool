package com.example.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        request.setAttribute("password", request.getParameter("password"));
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("username", request.getParameter("username"));
        request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
    }
}