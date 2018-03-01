package blog.ssm.dao;

import org.springframework.stereotype.Repository;

import blog.ssm.pojo.User;

/**
 * @author 阮航
 * @date 创建时间：2018年3月1日 下午2:38:53
 * @version 1.0
 */
@Repository
public interface UserDao {

	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(String userIds);

	public User find(String userId);
}
