import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class PurchaseService {
    constructor(
        private httpClient :HttpClient

    ) { }

    getProductBought (){
        const token =localStorage.getItem('token');
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': token
            })
          };
        return this.httpClient.get("http://localhost:8080/productBought/11",httpOptions);

    }
    buyProduct(movieName,userName,mail){
        const token =localStorage.getItem('token');
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json',
              'token': token
            })
          };
        return this.httpClient.get("http://localhost:8080/sendMail/"+mail+"/"+movieName+"/"+userName,httpOptions);

    }
}