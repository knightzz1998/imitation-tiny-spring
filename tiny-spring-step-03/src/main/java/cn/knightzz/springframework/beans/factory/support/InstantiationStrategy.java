package cn.knightzz.springframework.beans.factory.support;

import cn.knightzz.springframework.beans.BeansException;
import cn.knightzz.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author 王天赐
 * @title: InstantiationStrategy
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-29 16:37
 */
public interface InstantiationStrategy {

    /**
     * 实例化策略
     *
     * @param beanDefinition
     * @param beanName
     * @param constructor    通过反射获取的构造器对象, 目的是为了拿到
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantitate(BeanDefinition beanDefinition, String beanName,
                        Constructor constructor, Object[] args) throws BeansException;

}
