package com.wiktor.tasks.service;

import com.wiktor.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
