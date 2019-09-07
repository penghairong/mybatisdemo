package com.phr.test;

import com.phr.dao.OrderDao;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
public class MyImportBeanDefinitionRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        //1、得到bd
        //扫描所有接口
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(OrderDao.class);
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.phr.dao.OrderDao");
        beanDefinition.setBeanClass(MyFactoryBean.class);
        beanDefinitionRegistry.registerBeanDefinition("orderDao", beanDefinition);
    }
}
