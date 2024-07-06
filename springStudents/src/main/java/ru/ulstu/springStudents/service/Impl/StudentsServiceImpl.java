package ru.ulstu.springStudents.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.ulstu.springStudents.model.Student;
import ru.ulstu.springStudents.repository.StudentRepository;
import ru.ulstu.springStudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentsServiceImpl implements StudentService {
    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentsByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
    repository.deleteByEmail(email);
    }
}
