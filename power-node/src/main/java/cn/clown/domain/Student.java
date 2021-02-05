package cn.clown.domain;

import java.io.File;

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

    public Student() {
        super();
    }

    public Student(String name, Integer age, School school) {
        System.out.println("parametric construction method of student");
        this.name = name;
        this.age = age;
        this.school = school;
    }

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
