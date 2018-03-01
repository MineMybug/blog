package blog.dao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.ssm.dao.UserDao;
import blog.ssm.pojo.User;

/**
 * @author 阮航
 * @date 创建时间：2018年3月1日 下午3:03:16
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) // 使用spring测试
@ContextConfiguration(locations = "classpath:spring-mybatis.xml") // 设置spring配置文件路径
public class UserDaoTest {

	@Resource // 注入UserDao对象
	private UserDao userDao;
	@Resource
	private User user;
	
	@Test
	public void save (){
		user.setUserName("长江2号");
		boolean result = userDao.save(user);
		System.out.println(result);
	}
	
	@Test
	public void update (){
		user.setId("4");
		user.setUserName("长江3号");
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
