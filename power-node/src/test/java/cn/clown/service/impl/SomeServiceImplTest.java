package cn.clown.service.impl;

import cn.clown.domain.School;
import cn.clown.domain.Student;
import cn.clown.service.SomeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SomeServiceImplTest {
    //指定spring配置文件的位置和名称
    String resource = "applicationContext.xml";
    //创建spring容器对象
    ApplicationContext applicationContext = null;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext(resource);
    }

    @Test
    public void doSome() {
        //从spring容器中获取对象,使用id
        SomeService bean = (SomeService) applicationContext.getBean("someServiceImpl");
        //执行对象的业务方法
        bean.doSome();
    }

    @Test
    public void testDate() {
        Date date = (Date) applicationContext.getBean("Date");
        System.out.println("date.getTime() = " + date.getTime());
    }

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void testSetInjection() {
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("student = " + student);
    }

    @Test
    public void testInitDate() {
        Date date = (Date) applicationContext.getBean("date");
        System.out.println("date.getTime() = " + date.getTime());
    }

    @Test
    public void testSchool() {
        Student student1 = (Student) applicationContext.getBean("student1");
        School school = (School) applicationContext.getBean("school");
        System.out.println(student1);
        System.out.println(school);
    }

}
