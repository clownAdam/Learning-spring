import cn.clown.domain.Student;
import cn.concat.mybatis.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @org.junit.Test
    public void test01() {
        String conf = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(conf);
        StudentService proxy = (StudentService) context.getBean("studentServiceImpl");
        int res = proxy.addStudent(new cn.concat.mybatis.bean.Student(2, "annotation", 23));
        System.out.println(res);
    }
}
