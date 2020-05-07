package reflect.agent;

/**
 * @author liushuai
 * @create 2020/5/8
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public void login() {
        System.out.println("登录功能");
    }

    @Override
    public void regist() {
        System.out.println("注册功能");
    }
}
