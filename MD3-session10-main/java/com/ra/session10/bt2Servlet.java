package com.ra.session10;

import com.ra.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "hello", value = "/bt2-servlet")
public class bt2Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       response.sendRedirect("/bt2.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       String firstNum = request.getParameter("firstNum");
       String secondNum = request.getParameter("secondNum");
       String operator = request.getParameter("operator");
       if(Integer.parseInt(secondNum) == 0){
           request.setAttribute("message", "Second number is zero");
       }else{
           Integer result = 0;
           switch (operator){
               case "+":
                   result = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
                   break;
               case "-":
                   result = Integer.parseInt(firstNum) - Integer.parseInt(secondNum);
                   break;
               case "*":
                   result = Integer.parseInt(firstNum) * Integer.parseInt(secondNum);
                   break;
               case "/":
                   result = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
                   break;
           }
           request.setAttribute("result", result);
           request.setAttribute("firstNum", firstNum);
           request.setAttribute("operator", operator);
           request.setAttribute("secondNum", secondNum);
           request.getRequestDispatcher("/bt2-result.jsp").forward(request, response);
       }
    }
}
