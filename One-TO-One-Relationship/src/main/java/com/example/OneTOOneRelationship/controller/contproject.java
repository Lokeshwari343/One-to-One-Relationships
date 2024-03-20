package com.example.OneTOOneRelationship.controller;
import com.example.OneTOOneRelationship.model.modelproject;
import com.example.OneTOOneRelationship.service.servproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")

public class contproject {
        @Autowired
        private servproject servproject;

        @PostMapping("/add")
        public modelproject addmodelproject(@RequestBody  modelproject project){
            return servproject.addmodelproject(project);
        }
}
