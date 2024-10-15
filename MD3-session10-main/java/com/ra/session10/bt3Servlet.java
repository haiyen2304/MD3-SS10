package com.ra.session10;

import com.ra.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "bt3svl", value = "/bt3-servlet")
public class bt3Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,14,"Lays","https://www.laysvietnam.com/wp-content/uploads/2019/03/lays-mobile.png",14000));
        products.add(new Product(2,14,"Coca Cola","https://cooponline.vn/wp-content/uploads/2021/11/nuoc-giai-khat-coca-cola-vi-nguyen-ban-giam-duong-600ml.jpg",14000));
        products.add(new Product(3,14,"Quang Tran","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1NVA4Loy7MWOBIlTIY4mh4qe50K8McBlh2g&s",14000));
        request.setAttribute("products", products);
        request.getRequestDispatcher("bt3.jsp").forward(request, response);
    }
}
