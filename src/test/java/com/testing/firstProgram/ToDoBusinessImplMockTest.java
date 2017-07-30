package com.testing.firstProgram;;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Pratik Ambani on 5/02/2017.
 */
public class ToDoBusinessImplMockTest {

    @Test
    public void sample_test_to_check_total_counts_mock() {
        ToDoService toDoServiceMock = mock(ToDoService.class);
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);
        List<String> filteredTodos = toDoBusiness.retrieveTodos("Spring");

        assertEquals(3, filteredTodos.size());
        assertSame("Hi", "Spring M", filteredTodos.get(0));
    }

    @Test
    public void sample_test_to_check_total_counts_mock_succes() {
        ToDoService toDoServiceMock = mock(ToDoService.class);
        List<String> values = Arrays.asList("Spring Boot", "Spring MVC", "Spring JPA");
        when(toDoServiceMock.retrieveTodos("Spring M")).thenReturn(values);


        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoServiceMock);
        List<String> filteredTodos = toDoBusiness.retrieveOnlyMTodos("Spring M");

        assertEquals(1, filteredTodos.size());
        assertSame("Hi", "Spring Boot", filteredTodos.get(0));


    }

    @Test
    public void test_to()
    {

    }

}
