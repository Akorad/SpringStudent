package ru.ulstu.springStudents.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ulstu.springStudents.model.Student;
import ru.ulstu.springStudents.repository.InMemoryStudentAO;
import ru.ulstu.springStudents.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
