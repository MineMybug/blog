package blog.ssm.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import blog.ssm.dao.BloggerDao;
import blog.ssm.pojo.Blogger;
import blog.ssm.service.BloggerService;

/** 
 * @author  阮航  
 * @date 创建时间：2018年1月15日 上午11:22:43 
 * @version 1.0 
*/
@Service
public class BloggerServiceImpl implements BloggerService{

	@Autowired
	private BloggerDao bloggerDao;

	/*
	 * spring上下文应用
	 */
	@Autowired
	private ApplicationContext applicationContext;
	
	private BloggerService proxy;
	
	@PostConstruct
	public void init(){
		//从spring上下文中 获取AOP代理对象
		proxy = applicationContext.getBean(BloggerService.class);
	}
	
	@Override
	@Transactional
	public void insertBloggerParent() {

		Blogger blogger = new Blogger();
		blogger.setUserName("ww");
		blogger.setNickName("w1");
		blogger.setPassword("123456");
		blogger.setSign("123");
		bloggerDao.insertBlogger(blogger);
		try {
			proxy.insertBloggerChild();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertBloggerChild() {

		Blogger blogger = new Blogger();
		blogger.setUserName("w");
    	blogger.setNickName("w");
    	blogger.setPassword("123456");
    	blogger.setSign("123");
		bloggerDao.insertBlogger(blogger);
		throw new RuntimeException("Child exception!");
	}

}
