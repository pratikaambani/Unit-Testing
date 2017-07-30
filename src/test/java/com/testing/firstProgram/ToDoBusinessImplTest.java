package com.testing.firstProgram;;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by Pratik Ambani on 5/02/2017.
 */
public class ToDoBusinessImplTest {

    @Test
    public void sample_test_to_check_total_counts() {
        ToDoService toDoService = new ToDoServiceFactory();
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoService);
        List<String> filteredTodos = toDoBusiness.retrieveTodos("Spring");

        assertEquals(3, filteredTodos.size());
        assertSame("This is message", "Spring Boot", filteredTodos.get(0));

    }
}
