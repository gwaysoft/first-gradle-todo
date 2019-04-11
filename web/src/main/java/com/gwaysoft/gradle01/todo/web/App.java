package com.gwaysoft.gradle01.todo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gwaysoft.gradle01.todo.model.TodoItem;
import java.util.Scanner;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0){
            System.out.println(i + ". Please input todo item name:");
            TodoItem todoItem = new TodoItem(scanner.nextLine());
            log.info(todoItem.toString());
            log.debug(todoItem.toString());
        }
    }
}
