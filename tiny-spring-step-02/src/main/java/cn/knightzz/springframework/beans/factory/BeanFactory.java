package cn.knightzz.springframework.beans.factory;

/**
 * @author 王天赐
 * @title: BeanFactory
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-28 15:33
 */
public interface BeanFactory {

    /**
     * 获取Bean对象
     * @param beanName
     * @return
     */
    public Object getBean(String beanName);
}
