package cn.clown.service.impl;

import cn.clown.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeServiceImplTest {
    @Test
    public void doSome() {
        //指定spring配置文件的位置和名称
        String resource = "applicationContext.xml";
        //创建spring容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext(resource);
        //从spring容器中获取对象,使用id
        SomeService bean = (SomeService) context.getBean("someServiceImpl");
        //执行对象的业务方法
        bean.doSome();
    }
}
