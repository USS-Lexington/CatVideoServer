package cn.yuanandwen.web.servlet;

import cn.yuanandwen.pojo.User;
import cn.yuanandwen.pojo.Video;
import cn.yuanandwen.service.UserService;
import cn.yuanandwen.service.VideoService;
import cn.yuanandwen.service.impl.UserServiceImpl;
import cn.yuanandwen.service.impl.VideoServiceImpl;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Objects;

import static java.util.Objects.isNull;

@WebServlet(name = "UserAddServlet", value = "/UserAddServlet")
public class UserAddServlet extends HttpServlet {
	private UserService userService = new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取输入的json对象
		try {
			BufferedReader br = request.getReader();
			String params = br.readLine();
			//转化为User对象
			User user = JSON.parseObject(params,User.class);
			User dbUserValue=userService.queryUser(user);
			if(isNull(dbUserValue))
			{
				userService.add(user);
				response.getWriter().write("success");
			}else{
				if (Objects.equals(dbUserValue.getUsername(), user.getUsername())&& Objects.equals(dbUserValue.getPassword(), user.getPassword())){
					response.getWriter().write("success");
				}else{
					response.getWriter().write("failure:password");
				}
			}
		}catch (Exception e){
			response.getWriter().write("failure:repeat");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request,response);
	}
}
