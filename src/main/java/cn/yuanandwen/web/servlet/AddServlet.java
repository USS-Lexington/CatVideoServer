package cn.yuanandwen.web.servlet;

import cn.yuanandwen.pojo.Video;
import cn.yuanandwen.service.VideoService;
import cn.yuanandwen.service.impl.VideoServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    private VideoService videoService = new VideoServiceImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //获取输入的json对象
      BufferedReader br = request.getReader();
      String params = br.readLine();
      //转化为Video对象
      Video video = JSON.parseObject(params,Video.class);
      videoService.add(video);
      response.getWriter().write("success");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
	}
}
