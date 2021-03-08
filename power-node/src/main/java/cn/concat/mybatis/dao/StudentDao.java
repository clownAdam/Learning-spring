package cn.concat.mybatis.dao;

import cn.concat.mybatis.bean.Student;

import java.util.List;

/**
 * 学生dao接口
 * @author clown
 * @date 2021
 */
public interface StudentDao {
    /**
     * 插入学生信息
     * @param student 学生
     * @return 返回结果
     */
    int insertStudent(Student student);

    /**
     * 更新学生信息
     * @param student 学生
     * @return 返回更新结果
     */
    int updateStudent(Student student);

    /**
     * 删除学生信息
     * @param student 学生
     * @return 返回删除结果
     */
    int deleteStudent(Student student);

    /**
     * 根据id查询student信息
     * @param id id
     * @return 学生信息
     */
    Student selectStudentById(int id);

    /**
     * 查找所有学生信息
     * @return 返回所有学生信息
     */
    List<Student> selectAllStudents();

}
