import { Component, OnInit } from '@angular/core';
import { User } from '../User';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  public cities:string[]=["Mumbai", "Delhi","Bangalore","Kolkata","Los Angeles","Pune","Chennai"];
  user:User = new User("John","john@123","john@lti.com","9152652",""); 
  
  doRegister(){
    console.log(JSON.stringify(this.user));
  }
  constructor() { }

  ngOnInit(): void {
  }

}
