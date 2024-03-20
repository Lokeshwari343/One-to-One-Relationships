package com.example.OneTOOneRelationship.service;

import com.example.OneTOOneRelationship.model.modelproject;
import com.example.OneTOOneRelationship.repository.repoproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

@Service

public class servproject {
    @Autowired
   private repoproject repo;
    }


    public modelproject addmodelproject(modelproject project) {
        MemoryCredentialsCache repo;
        return repo.save(project);
    }

