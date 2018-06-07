import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

import { UserCreditCardService } from '../shared/usercreditcard.service';
import { ToastrService } from 'ngx-toastr';
import {BehaviorSubject} from 'rxjs/BehaviorSubject';

@Component({
  selector: 'app-usercreditcard',
  templateUrl: './usercreditcard.component.html',
  styleUrls: ['./usercreditcard.component.css']
})
export class UserCreditCardComponent implements OnInit {

  constructor(private userCreditCardService: UserCreditCardService, private toastr: ToastrService) { }

  public cardTypes = [
    { value: 'AMEX', display: 'AMEX' },
    { value: 'VISA', display: 'VISA' },
    { value: 'MC', display: 'MC' }
];

  userNames = Array<UserName>();

  ngOnInit() {
    this.resetForm();
    this.userNames = Array<UserName>();
   }

  resetForm(form?: NgForm) {
    if (form != null) {
      form.reset();
    }
     this.userCreditCardService.getUserList().subscribe(data => {
      data.map(a => this.userNames.push(new UserName(a.id, a.userName)));
    });
    this.userCreditCardService.selectedUserCreditCard = {
      id: null,
      cardNumber: null,
      cardType: this.cardTypes[0].value,
      cardHolderName: '',
      cardNickName: '',
      userID: null
    };
  }

  onSubmit(form: NgForm) {
    if (form.value.id == null) {
      this.userCreditCardService.postUserCreditCard(form.value)
        .subscribe(data => {
          this.resetForm(form);
          this.userCreditCardService.getUserCreditCardList();
          this.toastr.success('New Record Added Succcessfully', 'User Credit Card Register');
        });
    } else {
      this.userCreditCardService.putUserCreditCard(form.value.id, form.value)
        .subscribe(data => {
          this.resetForm(form);
          this.userCreditCardService.getUserCreditCardList();
          this.toastr.info('Record Updated Successfully!', 'User Credit Card Register');
        });
    }
  }
}

export class UserName {
    id: number;
    name: string;

    constructor(id: number, name: string) {
        this.id = id;
        this.name = name;
    }

}
