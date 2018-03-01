package blog.ssm.dao;

import org.springframework.stereotype.Repository;

import blog.ssm.pojo.User;

/**
 * @author �
 * @date ����ʱ�䣺2018��3��1�� ����2:38:53
 * @version 1.0
 */
@Repository
public interface UserDao {

	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(String userIds);

	public User find(String userId);
}
