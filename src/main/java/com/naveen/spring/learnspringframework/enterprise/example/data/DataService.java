package com.naveen.spring.learnspringframework.enterprise.example.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
    public List<Integer> getData() {
        // Fetch data from a database or an external service
        return Arrays.asList(10, 20, 30);
    }
}