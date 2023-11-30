package com.example.H2project.controller;

import com.example.H2project.models.Monster;
import com.example.H2project.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database-monster")
public class MonsterController {
    @Autowired
    private MonsterService repository;
    @GetMapping
    public List<Monster> getTuplesAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Monster getTupleId(@PathVariable(value = "id") Long id){
        return repository.findId(id);
    }
    @PostMapping
    public Monster createTuple(@RequestBody Monster tuple){
        return repository.save(tuple);
    }
    @PutMapping
    public Monster updateTuple(@RequestBody Monster tuple){
        return repository.update(tuple);
    }
    @DeleteMapping("/{id}")
    public void deleteTuple(@PathVariable(value = "id") Long id){
        repository.delete(id);
    }


}
