import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userName:string;
  pass:string;
  constructor(private router:Router) { }
          //DI injection -> Router Class
  ngOnInit(): void {
  }

  checkLogin()
  {
    
    console.log(this.userName+" "+this.pass);
    if(this.userName=="LTI" && this.pass=="LTI@123"){
      console.log("Login Success");
      this.router.navigate(['/Success']);
    }else{
      console.warn("Login Failed");
      this.router.navigate(['/Error']);
    }
  }
}

//navigate Method -> is used to navigate to Either pages 