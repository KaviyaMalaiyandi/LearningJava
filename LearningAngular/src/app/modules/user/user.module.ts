import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { UserHomeComponent } from './user-home/user-home.component';
import { UserHistoryComponent } from './user-history/user-history.component';


@NgModule({
  declarations: [UserHomeComponent, UserHistoryComponent],
  imports: [
    CommonModule,
    UserRoutingModule
  ]
})
export class UserModule { }
