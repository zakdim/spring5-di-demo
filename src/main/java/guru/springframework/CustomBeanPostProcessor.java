package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by dmitri on 2018-12-24
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean){
//            System.out.println("### CustomBeanPostProcessor.beforeInit: beanName=" + beanName);
            ((LifeCycleDemoBean) bean).beforeInit();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean){
//            System.out.println("### CustomBeanPostProcessor.afterInit: beanName=" + beanName);
            ((LifeCycleDemoBean) bean).afterInit();
        }

        return bean;
    }
}
