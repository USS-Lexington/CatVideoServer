package cn.yuanandwen.service.impl;

import cn.yuanandwen.mapper.VideoMapper;
import cn.yuanandwen.pojo.Video;
import cn.yuanandwen.service.VideoService;
import cn.yuanandwen.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class VideoServiceImpl implements VideoService {

	SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
	@Override
	public List<Video> selectAll() {
		//获取SqlSession
		SqlSession sqlSession = factory.openSession();
		//获取VideoMapper
		VideoMapper mapper = sqlSession.getMapper(VideoMapper.class);
		//调用方法
		List<Video> videos = mapper.selectAll();
		//释放
		sqlSession.close();
		return videos;
	}

	@Override
	public void add(Video video) {
		//获取SqlSession
		SqlSession sqlSession = factory.openSession();
		//获取VideoMapper
		VideoMapper mapper = sqlSession.getMapper(VideoMapper.class);
		//调用方法
		mapper.add(video);
		//提交
		sqlSession.commit();
		//释放
		sqlSession.close();
	}
}
