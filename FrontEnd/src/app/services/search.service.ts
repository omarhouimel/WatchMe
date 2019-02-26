import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class SearchService {
    constructor(
        private httpClient :HttpClient

    ) { }

    getSearchResult (data){
        return this.httpClient.get("http://127.0.0.1:3001/search?q="+data);

    }
}