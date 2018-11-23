import com.baizhi.springboot1.SpringBoot1Application;
import com.baizhi.springboot1.dao.UserDao;
import com.baizhi.springboot1.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBoot1Application.class)
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void mmm(){
        List<User> userList = userDao.getAll();
        for (User user : userList) {
            System.out.println("user = " + user);

        }
    }
}
