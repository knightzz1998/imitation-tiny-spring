package cn.knightzz.springframework.beans.factory.support;

import cn.knightzz.springframework.beans.BeansException;
import cn.knightzz.springframework.beans.factory.BeanFactory;
import cn.knightzz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author 王天赐
 * @title: AbstractBeanFactory
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 16:05
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    /**
     * 获取 Bean , 父类的抽象类中定义获取Bean的逻辑, 一些关键的逻辑让子类实现
     *
     * @param beanName
     * @return
     */
    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    private <T> T doGetBean(String beanName, Object[] args) {
        // 先从单例缓存中获取
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return (T) bean;
        }

        // 如果没有再去获取BeanDefinition
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T) createBean(beanName, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;


}
