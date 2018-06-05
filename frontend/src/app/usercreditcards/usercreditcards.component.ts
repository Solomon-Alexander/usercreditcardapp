import { Component, OnInit } from '@angular/core';

import {UserCreditCardService} from './shared/usercreditcard.service';
@Component({
  selector: 'app-usercreditcards',
  templateUrl: './usercreditcards.component.html',
  styleUrls: ['./usercreditcards.component.css'],
  providers: [UserCreditCardService]
})
export class UserCreditCardsComponent implements OnInit {

  constructor(private userCreditCardService: UserCreditCardService) { }

  ngOnInit() {
  }

}
