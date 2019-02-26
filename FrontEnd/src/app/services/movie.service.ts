import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class MovieService {
    constructor(
        private httpClient :HttpClient

    ) { }
    

    getMovies (){
        
        const token =localStorage.getItem('token');
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': token
            })
          };
          console.log("token ="+token)

        
        
        console.log(httpOptions);
        
        return this.httpClient.get("http://localhost:8080/movies",httpOptions);

    }
}