package com.possoul.coreJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class FlatMapper {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Peter", 20, Arrays.asList("1", "2")),
                new User("Sam", 40, Arrays.asList("3", "4", "5")),
                new User("Ryan", 60, Arrays.asList("6")),
                new User("Adam", 70, Arrays.asList("7", "8"))
        );
        
        List<Object> mapList = users.stream()
                .map(user -> user.getPhoneNumbers()).collect(Collectors.toList());

        System.out.println("Just Map :"+mapList);
        
        List<Object> flatMapList = users.stream()
                .map(user -> user.getPhoneNumbers().stream()).flatMap((phoneNoList)->phoneNoList).collect(Collectors.toList());
        
        
        System.out.println("Flat Map :"+flatMapList);
        
        Optional<String> stringOptional = users.stream()
                .map(user -> user.getPhoneNumbers().stream())
                .flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("8")))//to get new stream from given stream
                .findAny();

        stringOptional.ifPresent(System.out::println);

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    static class User {
        private String name;
        private Integer age = 30;
        private List<String> phoneNumbers;
        
    } 
}

       