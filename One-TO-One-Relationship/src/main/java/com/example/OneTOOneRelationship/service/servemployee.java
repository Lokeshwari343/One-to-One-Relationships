package com.example.OneTOOneRelationship.service;
import com.example.OneTOOneRelationship.model.modelemployee;
import com.example.OneTOOneRelationship.repository.repoemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class servemployee {
    @Autowired
    private repoemployee repo;
    public modelemployee addmodelemployee(modelemployee employee) {
        return repo.save(employee);
    }

    public modelemployee getmodelemployee(int id) {
        return repo.findById(id).get();
    }

    public List<modelemployee> getAllmodelemployee() {
        return repo.findAll();
    }

    public String deletemodelemployee(int id) {
        repo.deleteById(id);
        return "employee information deleted";
    }



}