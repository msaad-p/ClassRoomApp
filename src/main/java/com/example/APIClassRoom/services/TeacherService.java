package com.example.APIClassRoom.services;


import com.example.APIClassRoom.models.Teacher;
import com.example.APIClassRoom.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class TeacherService {

    @Autowired
    ITeacherRepository repository;

    public Teacher saveTeacher(Teacher teacherData)throws Exception{
        try{
            return this.repository.save(teacherData);
        }catch (Exception mistake){
            throw new Exception(mistake.getMessage());
        }
    }

    public Teacher modifyTeacher(Integer id, Teacher teacherData)throws Exception{
        try{
            Optional<Teacher>searchedTeacher=this.repository.findById(id);

            if(searchedTeacher.isPresent()){

                searchedTeacher.get().setExpertise((teacherData.getExpertise()));
                return this.repository.save(searchedTeacher.get());
            }else{
                throw new Exception();
            }
        }catch (Exception mistake){
            throw new Exception(mistake.getMessage());
        }
    }
}
