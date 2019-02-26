import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class AuthService {
    constructor(
        private httpClient :HttpClient

    ) { }

    authenticate (username,password){
         const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': '1'
            })
          };

        return this.httpClient.post("http://localhost:8080/authenticate",
        {"username":username,
        "password":password
    } ,httpOptions
    );
   

    }
}