package cn.yuanandwen.service;

import cn.yuanandwen.pojo.Video;

import java.util.List;

public interface VideoService {
	/**
	 * 查询所有
	 * @return
	 */
	List<Video> selectAll();

	/**
	 * 添加数据
	 * @param video
	 */
	void add(Video video);
}
