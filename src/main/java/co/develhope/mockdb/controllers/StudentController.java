package co.develhope.mockdb.controllers;

import co.develhope.mockdb.entities.Student;
import co.develhope.mockdb.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/create-student")
    public void createStudent(@RequestParam String firstName, @RequestParam String lastName,
                              @RequestParam String email){
        Student newStudent = new Student(firstName, lastName, email);
        studentRepo.save(newStudent);
    }

    @PostMapping("/create-student-with-body")
    @ResponseBody //capire meglio come usarlo!
    public void createStudentWithBody(@RequestBody Student student){
        studentRepo.save(student);
    }

    @GetMapping("get-all-students")
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}
