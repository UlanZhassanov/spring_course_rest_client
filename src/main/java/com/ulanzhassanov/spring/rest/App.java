package com.ulanzhassanov.spring.rest;

import com.ulanzhassanov.spring.rest.configuration.MyConfig;
import com.ulanzhassanov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        getAll
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        getByID
        Employee empByID = communication.getEmployee(1);
        System.out.println(empByID);
        context.close();
    }
}
