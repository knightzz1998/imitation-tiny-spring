package cn.knightzz.springframework.beans.factory.support;

import cn.knightzz.springframework.beans.BeansException;
import cn.knightzz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author 王天赐
 * @title: AbstractAutowireCapableBeanFactory
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 16:20
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {

        Object bean;

        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        // 将Bean实例添加到单例缓存中
        addSingleton(beanName, bean);
        return bean;
    }
}
