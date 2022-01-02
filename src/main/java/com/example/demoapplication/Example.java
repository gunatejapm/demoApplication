package com.example.demoapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
@Configuration
public class Example {
    @Bean
    public void Display() {
        /*CompletableFuture<List<Employee>> list = new CompletableFuture<List<Employee>>();
        List<Employee> list2 = new ArrayList<>();
        Employee emp = Employee.builder()
                .id("id1")
                .number("123")
                .build();
        list2.add(emp);
        System.out.println(emp);
        list=CompletableFuture.completedFuture(list2);
        System.out.println(list);*/
        Map<String,Object> map = new HashMap<>();
        Employee emp = Employee.builder()
                .id("id1")
                .number("123")
                .build();
        map.put("emp",emp);
        Employee emp1 = Employee.builder()
                .id("id3")
                .number("1234")
                .build();
        map.put("Emp1",emp1);
        System.out.println(map);
    }
}
