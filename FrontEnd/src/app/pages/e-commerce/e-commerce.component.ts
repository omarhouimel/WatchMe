import { Component, OnInit } from '@angular/core';
import { PurchaseService } from '../../services/purchase.service';
import { SearchService } from '../../services/search.service';

@Component({
  selector: 'ngx-ecommerce',
  templateUrl: './e-commerce.component.html',
})
export class ECommerceComponent implements OnInit {
  results:any[];
  movies: any;
  constructor(
    private searchService : SearchService
  ){}
    
  ngOnInit(){
 
   
  }
  onSearchChange(searchValue : string ) {  
    
    this.searchService.getSearchResult(searchValue).subscribe(
      (data:any)=>{
       this.results=data; 
      console.log(this.results) }
    )
}
}
