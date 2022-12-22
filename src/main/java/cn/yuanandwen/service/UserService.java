package cn.yuanandwen.service;

import cn.yuanandwen.pojo.User;
import cn.yuanandwen.pojo.Video;

import java.util.List;

public interface UserService {
	/**
	 * 查询用户
	 * @return
	 */
	User queryUser(User userInput);

	/**
	 * 添加数据
	 * @param user
	 */
	void add(User user);
}
