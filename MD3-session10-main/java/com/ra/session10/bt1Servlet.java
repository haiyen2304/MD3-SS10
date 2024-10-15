package com.ra.session10;

import com.ra.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/bt1-servlet")
public class bt1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      List<Customer> customers = new ArrayList<Customer>();
      customers.add(new Customer(1,"Quang Tran","Ha Noi","https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQgByBT5IiAT_a2x9pUVb4VMoOrlzHH7Jrzj-HB5jzHlR4lNLMS", LocalDate.of(1996,12,29)));
      customers.add(new Customer(2,"Duc Tran","Ha Noi","https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQgByBT5IiAT_a2x9pUVb4VMoOrlzHH7Jrzj-HB5jzHlR4lNLMS", LocalDate.of(1996,12,29)));
      request.setAttribute("customers", customers);
      request.getRequestDispatcher("bt1.jsp").forward(request,response);
    }
}
