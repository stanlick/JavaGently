package com.example.demo;

import java.time.LocalDate;
import java.time.Period;

class Calculator{

    public static Period getAge(LocalDate dob){
        return Period.between(LocalDate.now(),dob);
    }
    
    public static Period getDistance(LocalDate a, LocalDate b){
        return Period.between(a,b);
    }
}