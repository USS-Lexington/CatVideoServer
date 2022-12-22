package cn.yuanandwen.mapper;

import cn.yuanandwen.pojo.Video;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {
	/**
	 * 查询所有
	 * @return
	 */
	@Select("SELECT * FROM videos")
	@ResultMap("videoResultMap")
	List<Video> selectAll();

	/**
	 * 根据ID查询
	 * @return
	 */
	@Select("SELECT * FROM videos WHERE id=#{id}")
	@ResultMap("videoResultMap")
	List<Video> selectByID();

	/**
	 * 根据标题查询
	 * @return
	 */
	@Select("SELECT * FROM videos WHERE title=#{title}")
	@ResultMap("videoResultMap")
	List<Video> selectByTitle();

	/**
	 * 添加数据
	 * @param video
	 */
	@Insert("INSERT INTO videos values(null,#{videoTitle},#{artist},#{description},#{image},#{video})")
	void add(Video video);
}
