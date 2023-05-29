package com.hieu.springboot.demo.myspringapp.Interface;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "doing something!!!!";
    }
}
