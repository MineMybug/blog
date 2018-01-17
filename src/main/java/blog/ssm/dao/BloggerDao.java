package blog.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import blog.ssm.pojo.Blogger;

/**
* @author rh
* @version ����ʱ�䣺2017��8��8�� ����10:51:42
*/
@Repository //ע��Ϊ�־ò�bean
public interface BloggerDao {
	
	/**
	 * ��ȡ������Ϣ
	 * @return
	 */
	public List<Blogger> getBloggerData(Blogger blogger);
	
	/**
	 * ���Ӳ�����Ϣ
	 * @return
	 */
	public void insertBlogger(Blogger blogger);
	
	/**
	 * ͨ��id������Ϣ
	 * @param id
	 * @return
	 */
	public Blogger findOneById(Long id);
	
	/**
	 * ͨ��id��uerName��ѯ
	 * @param blogger
	 * @return
	 */
	public List<Blogger> selectInCondition(Blogger blogger);
	
	public List<Blogger> selectChoose(Blogger blogger);

}
