package cn.yuanandwen.web.servlet;

import cn.yuanandwen.pojo.Video;
import cn.yuanandwen.service.impl.VideoServiceImpl;
import com.alibaba.fastjson.JSON;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/VideoGetAllServlet")
public class SelectAllServlet extends HttpServlet {

    private final cn.yuanandwen.service.VideoService VideoService = new VideoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用service查询
        List<Video> Videos = VideoService.selectAll();

        //2. 转为JSON
        String jsonString = JSON.toJSONString(Videos);

        //3. 写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}