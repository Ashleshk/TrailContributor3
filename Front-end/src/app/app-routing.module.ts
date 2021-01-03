import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ForgotPasswordComponent } from './components/forgot-password/forgot-password.component';
import { ForgotUserIDComponent } from './components/forgot-user-id/forgot-user-id.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { SetNewPswComponent } from './components/set-new-psw/set-new-psw.component';
//import { ErrorComponent } from './error/error.component';
//import { HomeComponent } from './home/home.component';
//import { LoginComponent } from '.components/login-page/login-page.component';
//import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
//import { RegisterComponent } from './register/register.component';
///import { SuccessComponent } from './success/success.component';

const routes: Routes = [
  {path:'Login',component:LoginPageComponent},
  {path:'ForgotUserId',component:ForgotUserIDComponent},
  {path:'ForgotPassword',component:ForgotPasswordComponent},
  {path:'SetNewPassword',component:SetNewPswComponent} //If Any other links is typed by user
    // above line (pageNotFound) must be last line Always
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
