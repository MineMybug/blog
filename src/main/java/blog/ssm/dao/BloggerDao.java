package blog.ssm.dao;

import org.springframework.stereotype.Repository;

import blog.ssm.entity.Blogger;

/**
* @author rh
* @version 创建时间：2017年8月8日 下午10:51:42
*/
@Repository //注册为持久层bean
public interface BloggerDao {
	
	/**
	 * 获取博主信息
	 * @return
	 */
	public Blogger getBloggerData();
	
	/**
	 * 增加博主信息
	 * @return
	 */
	public void insertBlogger(Blogger blogger);

}
