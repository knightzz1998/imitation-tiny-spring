package cn.knightzz.springframework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王天赐
 * @title: BeanFactory
 * @projectName imitation-tiny-spring
 * @description:
 * @website <a href="http://knightzz.cn/">http://knightzz.cn/</a>
 * @github <a href="https://github.com/knightzz1998">https://github.com/knightzz1998</a>
 * @create: 2022-11-26 17:15
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMaps = new HashMap<>();

    public Object getBean(String beanName) {
        return beanDefinitionMaps.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMaps.put(beanName, beanDefinition);
    }
}
