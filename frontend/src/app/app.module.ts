import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { UserCreditCardsComponent } from './usercreditcards/usercreditcards.component';
import { UserCreditCardComponent } from './usercreditcards/usercreditcard/usercreditcard.component';
import { UserCreditCardListComponent } from './usercreditcards/usercreditcard-list/usercreditcard-list.component';
import { ToastrModule } from 'ngx-toastr';

@NgModule({
  declarations: [
    AppComponent,
    UserCreditCardsComponent,
    UserCreditCardComponent,
    UserCreditCardListComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpModule,
    ToastrModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
