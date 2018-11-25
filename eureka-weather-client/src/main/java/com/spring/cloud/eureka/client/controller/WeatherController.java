package com.spring.cloud.eureka.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
public class WeatherController {


    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBackGetWeather", commandKey = "fallback", groupKey = "fallback")
    @GetMapping(value = "/weather")
    public String getWeather(){

        String weather = "{\n" +
                "    \"coord\": {\n" +
                "        \"lon\": -0.13,\n" +
                "        \"lat\": 51.51\n" +
                "    },\n" +
                "    \"weather\": [\n" +
                "        {\n" +
                "            \"id\": 300,\n" +
                "            \"main\": \"Drizzle\",\n" +
                "            \"description\": \"light intensity drizzle\",\n" +
                "            \"icon\": \"09d\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"base\": \"stations\",\n" +
                "    \"main\": {\n" +
                "        \"temp\": 280.32,\n" +
                "        \"pressure\": 1012,\n" +
                "        \"humidity\": 81,\n" +
                "        \"temp_min\": 279.15,\n" +
                "        \"temp_max\": 281.15\n" +
                "    },\n" +
                "    \"visibility\": 10000,\n" +
                "    \"wind\": {\n" +
                "        \"speed\": 4.1,\n" +
                "        \"deg\": 80\n" +
                "    },\n" +
                "    \"clouds\": {\n" +
                "        \"all\": 90\n" +
                "    },\n" +
                "    \"dt\": 1485789600,\n" +
                "    \"sys\": {\n" +
                "        \"type\": 1,\n" +
                "        \"id\": 5091,\n" +
                "        \"message\": 0.0103,\n" +
                "        \"country\": \"GB\",\n" +
                "        \"sunrise\": 1485762037,\n" +
                "        \"sunset\": 1485794875\n" +
                "    },\n" +
                "    \"id\": 2643743,\n" +
                "    \"name\": \"London\",\n" +
                "    \"cod\": 200\n" +
                "}";
//        return restTemplate.getForObject("https://weather-client/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22", String.class);
        return weather;
    }

    public List<Object> fallBackGetWeather(){

        System.out.println("Call the fallback method");
        return Collections.emptyList();
    }
}
