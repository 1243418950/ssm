package cm.atguigu.test;

import com.atguigu.spring.Dao.UserDao;
import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {
    /**
     * @component:将类标识为普通组件
     * @Controller：将类标识为控制层组件
     * @Service：------------业务层--
     * @Respository：--------持久层-- 用途其实一样，只是标识给开发人员看的
     */

    @Test
    public void tt() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        UserService userService = ioc.getBean(UserService.class);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(userController);
        System.out.println(userDao);
        System.out.println(userService);
        userController.saveUser();


    }

}
