package cn.knightzz.springframework.test;

import cn.knightzz.springframework.beans.factory.config.BeanDefinition;
import cn.knightzz.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.knightzz.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author 王天赐
 * @title: ApiTest
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 16:41
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {

        // 1. 初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 第一次获取Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4. 第二次获取Bean
        UserService userServiceSingleton = (UserService) beanFactory.getSingleton("userService");
        userServiceSingleton.queryUserInfo();
    }
}
