package blog.ssm.service;


/** 
 * @author  阮航  
 * @date 创建时间：2018年1月15日 上午11:17:30 
 * @version 1.0 
*/


public interface BloggerService {

	/**
	 * 测试事务1
	 */
	public void insertBloggerParent();
	
	/**
	 * 测试事务2
	 */
	public void insertBloggerChild();
	
}
