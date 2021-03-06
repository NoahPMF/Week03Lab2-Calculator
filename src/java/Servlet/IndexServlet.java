/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NoahFerrier
 */
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstStr = request.getParameter("first");
        String secondStr = request.getParameter("second");
        String operation = request.getParameter("operation");

        int result = 0;

        if (firstStr != null && secondStr != null && !firstStr.equals("") && !secondStr.equals("")) {
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);

            char operationType = operation.charAt(0);

            switch (operationType) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '%':
                    result = first % second;
                    break;
            }
            
            request.setAttribute("message", result);
            getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }
        request.setAttribute("message", "please enter both values");
        getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }

}
