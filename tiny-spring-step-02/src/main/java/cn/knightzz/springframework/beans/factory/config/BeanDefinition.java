package cn.knightzz.springframework.beans.factory.config;

/**
 * @author 王天赐
 * @title: BeanDefinition
 * @projectName imitation-tiny-spring
 * @description: 封装Bean的Class对象
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 15:25
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
