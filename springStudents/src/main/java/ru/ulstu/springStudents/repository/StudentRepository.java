package ru.ulstu.springStudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ulstu.springStudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentsByEmail (String email);
}
