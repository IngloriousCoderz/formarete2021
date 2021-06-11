import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Todo } from '../Todo';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  @Input() todos: Todo[] = [];

  @Output() onToggle: EventEmitter<Todo> = new EventEmitter();
  @Output() onRemove: EventEmitter<number> = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  handleToggle(todo?: Todo) {
    this.onToggle.emit(todo);
  }

  handleRemove(id?: number) {
    this.onRemove.emit(id);
  }
}
