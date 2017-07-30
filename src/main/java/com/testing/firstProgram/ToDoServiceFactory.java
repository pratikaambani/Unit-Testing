package com.testing.firstProgram;;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pratik Ambani on 5/02/2017.
 */
public class ToDoServiceFactory implements ToDoService {

    public List<String> retrieveTodos(String user) {
        System.out.println("ToDoServiceFactory#retrieveTodos()");
        return Arrays.asList("Spring Boot", "Spring MVC", "Spring JPA");
    }

    public List<String> retrieveOnlyMTodos(String user) {
        return null;
    }
}
