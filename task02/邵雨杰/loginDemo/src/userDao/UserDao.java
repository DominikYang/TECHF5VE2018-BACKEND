package userDao;
/*
 * 验证类
 */
import entity.User;

public class UserDao {

	
	public boolean yanzhen(User A) {
		if("lalala".equals(A.getUsername())&&"lalala".equals(A.getPassword()))
		return true;
		return false;
	}
}
