package com.testing.firstProgram;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pratik Ambani on 5/02/2017.
 */
public class ToDoBusinessImpl implements ToDoService {

    private ToDoService toDoService;

    public ToDoBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    public List<String> retrieveTodos(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = toDoService.retrieveTodos(user);
        for (String todo : allTodos) {
            if (todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public List<String> retrieveOnlyMTodos(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = toDoService.retrieveTodos(user);
        for (String todo : allTodos) {
            if (todo.contains("Spring MVC")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

}
