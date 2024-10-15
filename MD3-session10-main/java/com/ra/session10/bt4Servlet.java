package com.ra.session10;

import com.ra.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bt4svl", value = "/bt4-servlet")
public class bt4Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       response.sendRedirect("bt4-add.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String stock = request.getParameter("stock");
        request.setAttribute("name", name);
        request.setAttribute("price", price);
        request.setAttribute("stock", stock);
        request.getRequestDispatcher("bt4-list.jsp").forward(request, response);
    }
}
