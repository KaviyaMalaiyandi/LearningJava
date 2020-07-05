import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-again',
  templateUrl: './home-again.component.html',
  styleUrls: ['./home-again.component.css']
})
export class HomeAgainComponent implements OnInit {
  counter = 0;
  isEnabled = true;
  enableDisbleClick = 'enable';

  constructor() { }

  ngOnInit() {
  }

  addCounter() {
    this.counter = this.counter + 1;
  }

  minusCounter() {
    this.counter = this.counter - 1;
  }

  clicked() {
    alert('clicked');
  }
  enableDisable() {
    if (this.isEnabled) {
      this.enableDisbleClick = 'disable';
      this.isEnabled = false;
    } else {
      this.enableDisbleClick = 'enable';
      this.isEnabled = true;
    }
  }
}
