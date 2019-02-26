import { Component } from '@angular/core';
import { RatingService } from '../../../../services/rating.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'ngx-interactive-progress-bar',
  templateUrl: 'interactive-progress-bar.component.html',
  styleUrls: ['interactive-progress-bar.component.scss'],
})
export class InteractiveProgressBarComponent  {

  constructor(
    private rating:RatingService,
    private routerLink:ActivatedRoute,
    private router : Router
  ) {
    
  }
  value =0;
  value1 = 0;
  value2=0;
  value3=0;

  setValue(newValue) {
    this.value = Math.min(Math.max(newValue, 0), 100);
    
  }
  setValue1(newValue) {
    this.value1 = Math.min(Math.max(newValue, 0), 100);
    
  }

  setValue2(newValue) {
    this.value2 = Math.min(Math.max(newValue, 0), 100);
    
  }
  
  setValue3(newValue) {
    this.value3 = Math.min(Math.max(newValue, 0), 100);
    
  }
  get status(){
    if (this.value <= 25) {
      return 'danger';
    } else if (this.value <= 50) {
      return 'warning';
    } else if (this.value <= 75) {
      return 'info';
    } else {
      return 'success';
    }
  }
  onClick(){
  let data={
    "plot_rating":this.value,
    "cinematography_rating":this.value1,
    "quality_rating":this.value2,
    "originality_rating":this.value3

  }
  const movieID =this.routerLink.snapshot.queryParamMap.get("id");
  const userID = localStorage.getItem("id"); 
 this.rating.submitrating(data,movieID,userID).subscribe((

  (data1:any )=> { 
    console.log(data1);}
 )) 
 const URL = "/pages/extra-components/progress-bar?id="+movieID;
 location.reload();
}
}
