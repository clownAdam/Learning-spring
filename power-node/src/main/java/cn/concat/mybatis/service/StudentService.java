package cn.concat.mybatis.service;

import cn.concat.mybatis.bean.Student;

import java.util.List;

/**
 * student service
 *
 * @author clown
 * @date 2021
 */
public interface StudentService {
    /**
     * 插入学生信息
     *
     * @param student 学生
     * @return 返回结果
     */
    int addStudent(Student student);

    /**
     * 更新学生信息
     *
     * @param student 学生
     * @return 返回更新结果
     */
    int modifyStudent(Student student);

    /**
     * 删除学生信息
     *
     * @param student 学生
     * @return 返回删除结果
     */
    int removeStudent(Student student);

    /**
     * 根据id查询student信息
     *
     * @param id id
     * @return 学生信息
     */
    Student findStudentById(int id);

    /**
     * 查找所有学生信息
     *
     * @return 返回所有学生信息
     */
    List<Student> findAllStudent();
}
