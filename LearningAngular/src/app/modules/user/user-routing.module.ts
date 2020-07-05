import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserHomeComponent } from './user-home/user-home.component';
import { UserHistoryComponent } from './user-history/user-history.component';


const routes: Routes = [
  {
    path: '',
    component: UserHomeComponent
  }, {
    path: 'history',
    component: UserHistoryComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
