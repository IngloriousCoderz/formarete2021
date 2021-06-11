import { Component, OnInit } from '@angular/core';
import { ApiService } from './api/api.service';
import { Todo } from './Todo';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Todo List'

  todos: Todo[] = []

  constructor(private api: ApiService) {}

  async ngOnInit() {
    this.todos = await this.api.fetchTodos();
  }

  async handleSubmit(text: string) {
    await this.api.addTodo(text)
    this.todos = await this.api.fetchTodos();
  }

  async handleToggle(todo: Todo) {
    await this.api.toggleDone(todo);
    this.todos = await this.api.fetchTodos();
  }

  async handleRemove(id: number) {
    await this.api.removeTodo(id);
    this.todos = await this.api.fetchTodos();
  }
}
