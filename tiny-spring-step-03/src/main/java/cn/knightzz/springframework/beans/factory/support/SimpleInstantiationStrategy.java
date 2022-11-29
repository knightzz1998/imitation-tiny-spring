package cn.knightzz.springframework.beans.factory.support;

import cn.knightzz.springframework.beans.BeansException;
import cn.knightzz.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 王天赐
 * @title: SimpleInstantiationStrategy
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-29 16:37
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantitate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {

        // 获取 Class对对象
        Class beanClass = beanDefinition.getBeanClass();

        try {
            if (null != constructor) {
                // 说明是有参构造
                return beanClass.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                return beanClass.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
