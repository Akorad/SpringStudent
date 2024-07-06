package ru.ulstu.springStudents.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ulstu.springStudents.model.Student;
import ru.ulstu.springStudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping ("/api/vl/students")
@AllArgsConstructor
public class StudentController {


    private final StudentService service;
    @GetMapping
    public List<Student> findAllStudent(){
    //todo
    return service.findAllStudent();
    }
    @PostMapping("save_student")
    public  Student saveStudent (@RequestBody Student student){
        return service.saveStudent(student);
    }
    @GetMapping ("/{email}")
    public Student findByEmail (@PathVariable("email") String email) {
        return service.findByEmail(email);
    }
    @PutMapping("update_student")
    public Student updateStudent (@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent (@PathVariable String email){
        service.deleteStudent(email);
    }

}
