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
@ContextConfiguration(locations = "classpath:spring-beans.xml") //����spring�����ļ�·��
public class BloggerDaoTest {

	    @Resource   //ע��BloggerDao����
	    private BloggerDao bloggerDao;

	    @Test
	    public void getBloggerData() throws Exception {
	        Blogger blogger = bloggerDao.getBloggerData();
	        System.out.println(blogger.toString());
	    }	
}
