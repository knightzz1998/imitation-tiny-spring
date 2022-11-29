package cn.knightzz.springframework.beans.factory.config;

/**
 * @author 王天赐
 * @title: SingletonBeanRegistry
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 15:33
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例的Bean对象
     * @param beanName
     * @return
     */
    public Object getSingleton(String beanName);
}
