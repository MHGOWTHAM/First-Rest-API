package com.KunalsStudent.studentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {
    Map<Integer,Student> db=new HashMap<>();

    public Student getStudent(int id){
         return db.get(id);
    }

    public String addStudent(Student student){

        int id=student.getAdmnNo();
        db.put(id,student);
        return "Student added Successfully";
    }

    public String deleteStudent(int id){
        if(!db.containsKey(id)){
            return "Invalid admnNo";
        }
        db.remove(id);
        return "Student removed Successfully";
    }

    public String updateStudent(int id,int age){
        if(!db.containsKey(id)){
            return "Invalid id";
        }
        db.get(id).setAge(age);
        return "Student is Updated";
    }
}
