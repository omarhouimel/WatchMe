import { Component, OnInit } from '@angular/core';
import { RatingService } from '../../../services/rating.service';
import { ActivatedRoute } from '../../../../../node_modules/@angular/router';

@Component({
  selector: 'ngx-progress-bar',
  templateUrl: 'progress-bar.component.html',
  styleUrls: ['progress-bar.component.scss'],
})
export class ProgressBarComponent implements OnInit {
  result:any;
  show =false;
  constructor(
    private ratingservice: RatingService,
    
    private routerLink  : ActivatedRoute,
  ){}
  ngOnInit(): void {
    
  const id =this.routerLink.snapshot.queryParamMap.get("id");
  this.ratingservice.getFinalRating(id).subscribe(
    (data:any )=> { 
this.result=data;
console.log(this.result);

    }
  );
  }
  onClick(target)  {
    this.show=true;
    target.scrollIntoView();
   
    }


}
