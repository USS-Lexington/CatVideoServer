package cn.yuanandwen.mapper;

import cn.yuanandwen.pojo.User;
import cn.yuanandwen.pojo.Video;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
	/**
	 * 查询所有
	 * @return
	 */
	@Select("SELECT * FROM user")
	List<User> selectAll();

	@Select("SELECT * FROM user WHERE (username=#{username})")
	User queryUser(User user);

	/**
	 * 添加数据
	 * @param user
	 */
	@Insert("INSERT INTO user values(#{username},#{password})")
	void add(User user);
}
