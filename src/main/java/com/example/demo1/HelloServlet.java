package com.example.demo1;

import java.io.*;
import java.util.Date;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Fri Apr 20";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        Date today = new Date();

        writer.println("<h1>" + message +  today  + " ICT 2018 " + "</h1>");
        writer.println("</body></html>");
    }

    public void destroy() {
    }
}
