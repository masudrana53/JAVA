import { Component } from '@angular/core';
import { TodoList } from './todolist';
import { TodoItem } from './todoitem';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  private list = new TodoList("List",[
    new TodoItem("Singra Khabo"),
    new TodoItem("Joriman Korbo"),
    new TodoItem("Cha khabo")

  ]);

  get username(): string{
    return this.list.user;
  }

  get itemCount(): number{
    return this.list.items.filter(item => !item.complete).length;
  }

  title = 'Angularthird';
}
