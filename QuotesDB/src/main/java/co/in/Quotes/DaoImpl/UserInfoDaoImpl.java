/* 
 * Ramit
 * */
package co.in.Quotes.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.in.Quotes.Dao.UserInfoDao;
import co.in.Quotes.Model.UserInfo;

@Transactional
@Repository("userInfoDao")
public class UserInfoDaoImpl implements UserInfoDao {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean insertUser(UserInfo userInfo) {
		try {
			sessionFactory.getCurrentSession().save(userInfo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
