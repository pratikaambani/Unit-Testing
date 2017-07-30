package com.testing.firstProgram;;

import java.util.List;

/**
 * Created by Pratik Ambani on 5/02/2017.
 */
public interface ToDoService {

    public List<String> retrieveTodos(String user);

    public List<String> retrieveOnlyMTodos(String user);


}
