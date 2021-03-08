import cn.clown.aspectj.SomeService;
import cn.clown.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @org.junit.Test
    public void test01(){
        String conf = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(conf);
        SomeService proxy = (SomeService) context.getBean("SomeServiceImpl");
        proxy.doAround("zs",23);
    }
}
