package com.Demoverse.test;

import com.Demoverse.Entities.*;
import com.Demoverse.Services.AppServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/test"})
public class test_Data extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AppServices services = new AppServices();
        DetailRoom entity = new DetailRoom();
        entity.setEmail("huynhthoa.com.vn");
        entity.setKey_Room(2);
        services.deatailRoom.delete(entity);
        //entity.setEmail_blocked("abc@123.com.vn");
        //services.blockList.add(entity);
        System.out.println("THanh cong cahy");
    }
}
