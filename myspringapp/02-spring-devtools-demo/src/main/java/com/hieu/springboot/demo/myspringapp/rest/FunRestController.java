package com.hieu.springboot.demo.myspringapp.rest;


import com.hieu.springboot.demo.myspringapp.Interface.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private Coach mycoach;
    public FunRestController(){

    }
    @Autowired
    public FunRestController(Coach mycoach){
        this.mycoach = mycoach;
    }
    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String TeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/")
    public String Hello(){
        return mycoach.getDailyWorkout();
    }

    @GetMapping("/how1")
    public String Hi(){
        return "hi!!!!!";
    }

    @GetMapping("/how2")
    public String Hi2(){
        return "hi2!!!!!";
    }
}
