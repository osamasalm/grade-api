package com.osama;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Student> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updated) {
        Student student = repository.findById(id).orElse(null);
        if (student != null) {
            student.setName(updated.getName());
            student.setGrade(updated.getGrade());
            return repository.save(student);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        repository.deleteById(id);
        return "Deleted student " + id;
    }
}