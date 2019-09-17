package com.fu.lei.flog.controller;

import com.fu.lei.flog.entity.FlogTaskEntity;
import com.fu.lei.flog.repository.FlogTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private FlogTaskRepository flogTaskRepository;

    @RequestMapping("/task/save")
    public void insert(){
        FlogTaskEntity flogTaskEntity = new FlogTaskEntity();
        flogTaskEntity.setTaskName("不好");
        flogTaskRepository.save(flogTaskEntity);
    }
}
