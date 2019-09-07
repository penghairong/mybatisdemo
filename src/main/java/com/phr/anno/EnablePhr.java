package com.phr.anno;

import com.phr.test.MyImportBeanDefinitionRegistar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Import(MyImportBeanDefinitionRegistar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnablePhr {

}
