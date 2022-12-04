package com.example.assistant;

import java.util.ArrayList;

public class ToDoList {
    public ArrayList<Task> tasks;

    public ToDoList(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task t){
        this.tasks.add(t);
    }

    public void removeTask(Task t){
        this.tasks.remove(t);
    }


}
