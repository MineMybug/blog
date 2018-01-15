package blog.dao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.ssm.dao.BloggerDao;
import blog.ssm.entity.Blogger;

/**
* @author rh
* @version ����ʱ�䣺2017��8��8�� ����10:58:59
*/
@RunWith(SpringJUnit4ClassRunner.class) //ʹ��spring����
@ContextConfiguration(locations = "classpath:spring-mybatis.xml") //����spring�����ļ�·��
public class BloggerDaoTest {

	    @Resource   //ע��BloggerDao����
	    private BloggerDao bloggerDao;

	    @Test
	    public void getBloggerData() throws Exception {
	        Blogger blogger = bloggerDao.getBloggerData();
	        System.out.println(blogger.toString());
	    }
	    
	    @Test
	    public void insertBlogger(){
	    	Blogger blogger = new Blogger();
	    	blogger.setUserName("ww");
	    	blogger.setNickName("w1");
	    	blogger.setPassword("123456");
	    	blogger.setSign("123");
	    	bloggerDao.insertBlogger(blogger);
//	    	System.out.println(num);
//	    	return num;
	    }
}
