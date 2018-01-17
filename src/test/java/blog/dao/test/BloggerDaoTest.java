package blog.dao.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.ssm.dao.BloggerDao;
import blog.ssm.pojo.Blogger;

/**
* @author rh
* @version 创建时间：2017年8月8日 下午10:58:59
*/
@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-mybatis.xml") //设置spring配置文件路径
public class BloggerDaoTest {

	    @Resource   //注入BloggerDao对象
	    private BloggerDao bloggerDao;
	    @Resource
	    private Blogger blogger;

	    @Test   
	    public void getBloggerData() throws Exception {
	    	Blogger blogger = new Blogger();
	    	blogger.setId(29);
	    	blogger.setUserName("ww");
	        List<Blogger> list = bloggerDao.getBloggerData(blogger);
	        System.out.println(list.toString());
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
	    
	    @Test
	    public void findOneById(){
	    	Long id = 28l;
	    	Blogger blogger = bloggerDao.findOneById(id);
	    	System.out.println(blogger);
	    }
	    
	    @Test
	    public void selectInCondition(){
	    	blogger.setId(28);
//	    	blogger.setUserName("ww");
	    	List<Blogger> list = bloggerDao.selectInCondition(blogger);
	    	for(Blogger blogger : list){
	    		System.out.println(blogger.toString());
	    	}
	    }
	    
	    @Test
	    public void selectChoose(){
	    	blogger.setId(5);
	    	blogger.setUserName("ww");
	    	blogger.setPassword("123456");
	    	List<Blogger> list = bloggerDao.selectChoose(blogger);
	    	for(Blogger blogger : list){
	    		System.out.println(blogger.toString());
	    	}
	    }
}
