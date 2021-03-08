package cn.concat.mybatis.service.impl;

import cn.concat.mybatis.bean.Student;
import cn.concat.mybatis.dao.StudentDao;
import cn.concat.mybatis.service.StudentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Student service impl
 *
 * @author clown
 * @date 2021
 */
@Component("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int modifyStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int removeStudent(Student student) {
        return studentDao.deleteStudent(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentDao.selectStudentById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentDao.selectAllStudents();
    }
}
