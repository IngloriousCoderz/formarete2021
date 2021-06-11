import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Todo List'

  text = ''

  todos = [
    { id: 1, text: 'Learn Angular', done: true },
    { id: 2, text: 'Suffer', done: false },
    { id: 3, text: 'Switch to React' },
  ]

  // handleChange(event: any) {
  //   this.text = event.target.value;
  // }

  handleSubmit() {
    const maxId = this.todos.length ? this.todos[this.todos.length - 1].id : 0;
    this.todos.push({ id: maxId + 1, text: this.text });
    this.text = '';
  }

  handleToggle(id: number) {
    const todo = this.todos.find((todo) => todo.id === id);
    if (todo) {
      todo.done = !todo.done;
    }
  }

  handleRemove(id: number) {
    const index = this.todos.findIndex((todo) => todo.id === id);
    this.todos.splice(index, 1);
  }
}
