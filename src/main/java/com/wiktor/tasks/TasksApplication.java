package com.wiktor.tasks;

import com.wiktor.tasks.domain.Task;
import com.wiktor.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L, "Create Spring Boot Application", LocalDate.now(), false
            ));
            taskService.save(new Task(2L, "Create Spring Project Packages", LocalDate.now(), true
            ));
            taskService.save(new Task(3L, "Create the Task Domain Class", LocalDate.now(), true
            ));
            taskService.save(new Task(4L, "Create service and repository classes", LocalDate.now(), true
            ));
            taskService.save(new Task(5L, "Create the command line runner to load data", LocalDate.now(), true
            ));
            taskService.save(new Task(6L, "Create the required configuration properties", LocalDate.now(), true
            ));
            taskService.save(new Task(7L, "Run the Spring Boot Application", LocalDate.now(), true
            ));
            taskService.save(new Task(8L, "Check the H2 Console for the initial data", LocalDate.now(), true
            ));
        };
    }
}
