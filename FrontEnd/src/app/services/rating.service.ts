import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { ActivatedRoute } from "../../../node_modules/@angular/router";

@Injectable()
export class RatingService {
    constructor(
        private httpClient :HttpClient,
        private routerLink  : ActivatedRoute
    ) { }


    getFinalRating (movieid){
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': localStorage.getItem("token")
            })
          };
          console.log(localStorage.getItem("token"))
        
        return this.httpClient.get("http://localhost:8080/getMoviRating?id="+movieid,httpOptions);

    }
 submitrating(data,movieid,userid){
    const httpOptions = {
        headers: new HttpHeaders({
          'Content-Type':  'application/json',
          'token':  localStorage.getItem("token")
        })
      };
     return this.httpClient.post("http://localhost:8080/addRating/"+userid+"/"+movieid,data,httpOptions);
 }
}