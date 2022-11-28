package cn.knightzz.springframework;

import cn.knightzz.springframework.bean.UserService;
import org.junit.Test;

/**
 * @author 王天赐
 * @title: ApiTest
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 15:10
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        // 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 封装UserService对象成BeanDefinition对象
        UserService userService = new UserService();
        BeanDefinition beanDefinition = new BeanDefinition(userService);

        // 注册Bean
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取注册的Bean
        UserService service = (UserService) beanFactory.getBean("userService");
        service.queryUserInfo();
    }
}
