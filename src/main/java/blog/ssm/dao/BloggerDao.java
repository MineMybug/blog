package blog.ssm.dao;

import org.springframework.stereotype.Repository;

import blog.ssm.entity.Blogger;

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
	public Blogger getBloggerData();
	
	/**
	 * ���Ӳ�����Ϣ
	 * @return
	 */
	public void insertBlogger(Blogger blogger);

}
