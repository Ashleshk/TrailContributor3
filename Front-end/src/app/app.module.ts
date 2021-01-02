import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { HomeComponent } from './home/home.component';
//import { LoginComponent } from './login/login.component';
//import { RegisterComponent } from './register/register.component';
//import { FormsModule } from '@angular/forms';
//import { SuccessComponent } from './success/success.component';
//import { ErrorComponent } from './error/error.component';
//import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { LoginPageComponent } from './components/login-page/login-page.component';
import { ForgotUserIDComponent } from './components/forgot-user-id/forgot-user-id.component';
import { ForgotPasswordComponent } from './components/forgot-password/forgot-password.component';
import { SetNewPswComponent } from './components/set-new-psw/set-new-psw.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    ForgotUserIDComponent,
    ForgotPasswordComponent,
    SetNewPswComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
