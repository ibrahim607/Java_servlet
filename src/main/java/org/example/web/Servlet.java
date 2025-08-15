package org.example.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.products.Product;
import org.example.products.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/first")
public class Servlet extends HttpServlet {
    ProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(), productService.getAllProducts());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Product product = mapper.readValue(req.getReader(), Product.class);
        productService.add(product);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        Product updatedProduct = mapper.readValue(req.getReader(), Product.class);
        int id = Integer.parseInt(req.getParameter("id"));

        boolean success = productService.update(id, updatedProduct);

        resp.setContentType("application/json");
        if (success) {
            resp.getWriter().write("{\"message\":\"Product updated successfully\"}");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("{\"message\":\"Product not found\"}");
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        boolean success = productService.deleteById(id);

        resp.setContentType("application/json");
        if (success) {
            resp.getWriter().write("{\"message\":\"Product deleted successfully\"}");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("{\"message\":\"Product not found\"}");
        }
    }
}
