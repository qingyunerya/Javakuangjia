package com.qingyunerya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
 
        Category c = (Category) context.getBean("c");
        Test t=(Test) context.getBean("d");
        Product p=(Product) context.getBean("p");
        ApplicationContext context2=new ClassPathXmlApplicationContext(new String[] {"TestContext.xml"});
        TestTwo tw=(TestTwo) context2.getBean("e");
        System.out.println(c.getName()+t.getName()+p.getCategory().getName()+p.getName()+tw.getName());
    }
}
