package cn.yuanandwen.web.servlet;

import cn.yuanandwen.pojo.Video;
import cn.yuanandwen.service.VideoService;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "VideoUploadServlet", value = "/VideoUploadServlet")
public class VideoUploadServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("456456");
		System.out.println(request.getParameter("video"));
		//1. 调用service查询
//      List<Video> Videos = VideoService.selectAll();

		//2. 转为JSON
//      String jsonString = JSON.toJSONString(request.getParameter());

		//3. 写数据
//      response.setContentType("text/json;charset=utf-8");
//      response.getWriter().write(jsonString);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
