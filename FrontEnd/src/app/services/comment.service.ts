import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class CommentService {
    tab:any[]
    constructor(
        private httpClient :HttpClient

    ) { }

    getComments (movieID){
        const token =localStorage.getItem('token');
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': token
            })
          };
          console.log("token ="+token)
        return this.httpClient.get("http://localhost:8080/movieComment?id="+movieID,httpOptions);

    }
     addComment(comment,movieID){
        const token =localStorage.getItem('token');
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': token
            })
          };
        return this.httpClient.post("http://localhost:8080/addCommentToMovie/"+movieID,{'body':comment,'date':new Date()},httpOptions);
        
    }
}