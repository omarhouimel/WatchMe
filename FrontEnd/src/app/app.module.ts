/**
 * @license
 * Copyright Akveo. All Rights Reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */
import { APP_BASE_HREF } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { CoreModule } from './@core/core.module';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { ThemeModule } from './@theme/theme.module';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PurchaseService } from './services/purchase.service';
import { MovieService } from './services/movie.service';
import { CommentService } from './services/comment.service';
import {TableModule} from 'primeng/table';
import { SearchService } from './services/search.service';
import { RatingService } from './services/rating.service';
import { LoginComponent } from './login/login.component';
import { AuthService } from './services/auth.service';



@NgModule({
  declarations: [AppComponent, LoginComponent],
  imports: [
    TableModule,
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    AppRoutingModule,

    NgbModule.forRoot(),
    ThemeModule.forRoot(),
    CoreModule.forRoot(),
  ],
  bootstrap: [AppComponent],
  providers: [
    { provide: APP_BASE_HREF, useValue: '/' },
    PurchaseService,
    MovieService,
    CommentService,
    SearchService,
    RatingService,
    AuthService
  
    ],
})
export class AppModule {
}
