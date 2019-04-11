package com.gwaysoft.gradle01.todo.repository;

import com.gwaysoft.gradle01.todo.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {
    //Logger logger = LoggerFactory
    private static Map<String, TodoItem> todoItemMap = new HashMap<String,TodoItem>();

    public static void save(TodoItem todoItem){
        todoItemMap.put(todoItem.getName(),todoItem);
    }
}
