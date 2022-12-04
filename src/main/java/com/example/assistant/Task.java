package com.example.assistant;

import java.util.Date;

public class Task {
    public String taskName;
    public Date startDate;
    public Date dueDate;
    public int completionLength;
    public int priority; // can only be 1, 2 or 3
    public boolean fav;

    public Task(String taskName, Date startDate, Date dueDate, int completionLength, int priority) {
        this.taskName = taskName;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.completionLength = completionLength;
        this.priority = priority;
        this.fav = false; // default setting
    }

    public void changeName(String newName) {
        this.taskName = newName;
    }

    public void changeStart(Date newStart) {
        this.startDate = newStart;
    }

    public void changeDue(Date newDue) {
        this.dueDate = newDue;
    }

    public void changeLen(int newLen) {
        this.completionLength = newLen;
    }

    public void changePriority(int newPriority) {
        this.priority = newPriority;
    }

    public void toggleFav() {
        this.fav = !this.fav;
    }
}
