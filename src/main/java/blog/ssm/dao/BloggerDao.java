package blog.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import blog.ssm.pojo.Blogger;

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
	public List<Blogger> getBloggerData(Blogger blogger);
	
	/**
	 * 增加博主信息
	 * @return
	 */
	public void insertBlogger(Blogger blogger);
	
	/**
	 * 通过id查找信息
	 * @param id
	 * @return
	 */
	public Blogger findOneById(Long id);
	
	/**
	 * 通过id和uerName查询
	 * @param blogger
	 * @return
	 */
	public List<Blogger> selectInCondition(Blogger blogger);
	
	public List<Blogger> selectChoose(Blogger blogger);

}
