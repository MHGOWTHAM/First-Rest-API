package com.KunalsStudent.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int id){
        return studentService.getStudent(id);
    }

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/delete_student/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        return studentService.updateStudent(id,age);
    }

//    @GetMapping("/get_student/{admnNo}")
//    public Student getStudent(@PathVariable("admnNo") int admnNo){
//        return db.get(admnNo);
//    }
//    @GetMapping("/get_student")
//    public String getStudent(@RequestParam("admnNo") int admnNo,@RequestParam("name") String name){
//        return "2: Api Two";
//    }
}
