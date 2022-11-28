package cn.knightzz.springframework;

/**
 * @author 王天赐
 * @title: BeanDefinition
 * @projectName imitation-tiny-spring
 * @description: 用于封装Bean对象
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-26 16:57
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
