package com.kohli.springboottospring;

import com.kohli.springboottospring.answer1.BInarySearch;
import com.kohli.springboottospring.answer1.InsertionSort;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class ApplicationContextPractice {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            InsertionSort user = context.getBean("user", InsertionSort.class);
            BInarySearch person = context.getBean("person", BInarySearch.class);
            user.setPerson(person);
            System.out.println(user);
            user.getPerson();
        }
    }
}
