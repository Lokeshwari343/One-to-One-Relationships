package com.example.OneTOOneRelationship.controller;
import com.example.OneTOOneRelationship.model.modelemployee;
import com.example.OneTOOneRelationship.service.servemployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class contemployee {
    @Autowired
    private servemployee servemployee;

    @PostMapping("/add")
    public modelemployee addmodelemployee(@RequestBody modelemployee employee){
        return servemployee.addmodelemployee(employee);
    }
    @GetMapping("/{id}")
    public modelemployee getmodelemployee(@PathVariable int id){
        return servemployee.getmodelemployee(id);
    }
    @GetMapping("/all")
    public List<modelemployee> getAllmodelemployee(){
        return servemployee.getAllmodelemployee();
    }
    @DeleteMapping("/{id}")
    public String deletemodelemployee(@PathVariable int id){
        return servemployee.deletemodelemployee(id);
    }
}