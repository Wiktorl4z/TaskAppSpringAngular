import {Component, OnInit, ViewEncapsulation} from '@angular/core';
import {Task} from "./task.model";
import {TaskService} from "../task.service";

@Component({
    selector: 'app-tasks-list',
    templateUrl: './tasks-list.component.html',
    styleUrls: ['./tasks-list.component.css'],
    encapsulation: ViewEncapsulation.None
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

    constructor(private  taskService: TaskService) {
    }

    ngOnInit() {
        return this.taskService.getTasks()
            .subscribe(
                (tasks: any[]) => {
                    this.tasks = tasks
                },
                (error) => console.log(error)
            );
    }

    getDuoDateLabel(task: Task) {
        return task.completed ? 'label-success' : 'label-primary';
    }

    onTaskChange(event, task) {
        console.log("Task hes changed")
    }
}
