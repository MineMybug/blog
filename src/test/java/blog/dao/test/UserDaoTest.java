package blog.dao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.ssm.dao.UserDao;
import blog.ssm.pojo.User;

/**
 * @author �
 * @date ����ʱ�䣺2018��3��1�� ����3:03:16
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) // ʹ��spring����
@ContextConfiguration(locations = "classpath:spring-mybatis.xml") // ����spring�����ļ�·��
public class UserDaoTest {

	@Resource // ע��UserDao����
	private UserDao userDao;
	@Resource
	private User user;
	
	@Test
	public void save (){
		user.setUserName("����2��");
		boolean result = userDao.save(user);
		System.out.println(result);
	}
	
	@Test
	public void update (){
		user.setId("4");
		user.setUserName("����3��");
		boolean result = userDao.update(user);
		System.out.println(result);
	}
	
	@Test
	public void delete (){
		String userId = "4";
		boolean result = userDao.delete(userId);
		System.out.println(result);
	}
	
	@Test
	public void find (){
		String userId = "3";
		user = userDao.find(userId);
		System.out.println(user.toString());
	}

}
