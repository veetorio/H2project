package com.example.H2project.service;


import com.example.H2project.models.Monster;
import com.example.H2project.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {
    @Autowired
    MonsterRepository repository;

    public List<Monster> findAll(){
        return repository.findAll();
    }
    public Monster findId(Long id){
        return repository.findById(id).orElseThrow();
    }
    public Monster save(Monster tuple){
        return repository.save(tuple);
    }
    public Monster update(Monster tuple){
        Monster entity = repository.findById(tuple.getId()).orElseThrow();
        entity.setDescribe(tuple.getDescribe());
        entity.setName(tuple.getName());
        return entity;
    }
    public void delete(Long id){
        repository.delete(findId(id));
    }

}
