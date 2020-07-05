import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HomeAgainComponent } from './home-again/home-again.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    children: [
      {
        path: 'user',
        loadChildren: './modules/user/user.module#UserModule'
      }
    ]
  },{
    path: 'home-again',
    component: HomeAgainComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
