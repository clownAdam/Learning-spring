package cn.clown.domain;

/**
 * <description>学生-实体类</description>
 *
 * @author clown
 * @date 2021
 */
public class Student {
    private String name;
    private Integer age;
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
