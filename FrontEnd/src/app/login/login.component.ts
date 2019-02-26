import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'ngx-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  loading = false;
  submitted = false;
  returnUrl: string;

  constructor(
      private formBuilder: FormBuilder,
      private route: ActivatedRoute,
      private router: Router,
      private authService : AuthService
   
   ) {}

  ngOnInit() {
      this.loginForm = this.formBuilder.group({
          username: ['', Validators.required],
          password: ['', Validators.required]
      });
      // reset login status
     
      // get return url from route parameters or default to '/'
      this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
  }

  // convenience getter for easy access to form fields
  //get f() { return this.loginForm.controls; }

  onSubmit() {
    //  this.submitted = true;

      // stop here if form is invalid
      if (this.loginForm.invalid) {
          return;
      }
     const password =this.loginForm.controls["password"].value
     const email = this.loginForm.controls["username"].value
     this.authService.authenticate(email,password).subscribe(
       (data:any)=>{
         console.log(data);
         localStorage.setItem('token',data.token);
         localStorage.setItem('userName',data.first_name);
         localStorage.setItem('mail',data.user_name);
         localStorage.setItem('id',data.id);
         this.router.navigate(['/pages/iot-dashboard']);
         
       }
     )
     
     
  }
}