package com.example.finalProject.controller;

import com.example.finalProject.model.Student;
import com.example.finalProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/get/{id}")
    public Student getById(@PathVariable Long id) {
        return studentService.getById(id);
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/edit/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        //   student.setId(id);
        return studentService.updateStudent(student);
    }

    @DeleteMapping(value="/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}