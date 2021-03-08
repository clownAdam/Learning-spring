package cn.clown.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <description>学生-实体类</description>
 *
 * @author clown
 * @date 2021
 */
@Component("student")
public class Student {
    static {
        System.out.println("hello1");
    }

    @Value("clown")
    private String name;
    @Value("23")
    private Integer age;

    /**
     * TODO:
     *
     * @Autowired(required = false)
     * @Qualifier("school")
     */
    @Resource(name = "myschool")
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
