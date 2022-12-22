package cn.yuanandwen.service.impl;

import cn.yuanandwen.mapper.UserMapper;
import cn.yuanandwen.mapper.VideoMapper;
import cn.yuanandwen.pojo.User;
import cn.yuanandwen.pojo.Video;
import cn.yuanandwen.service.UserService;
import cn.yuanandwen.service.VideoService;
import cn.yuanandwen.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserServiceImpl implements UserService {

	SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
	@Override
	public User queryUser(User userInput) {
		//获取SqlSession
		SqlSession sqlSession = factory.openSession();
		//获取UserMapper
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		//调用方法
		User user = mapper.queryUser(userInput);
		//释放
		sqlSession.close();
		return user;
	}

	@Override
	public void add(User user) {
		//获取SqlSession
		SqlSession sqlSession = factory.openSession();
		//获取UserMapper
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		//调用方法
		mapper.add(user);
		//提交
		sqlSession.commit();
		//释放
		sqlSession.close();
	}
}
