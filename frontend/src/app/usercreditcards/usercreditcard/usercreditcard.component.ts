import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

import { UserCreditCardService } from '../shared/usercreditcard.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-usercreditcard',
  templateUrl: './usercreditcard.component.html',
  styleUrls: ['./usercreditcard.component.css']
})
export class UserCreditCardComponent implements OnInit {

  constructor(private userCreditCardService: UserCreditCardService, private toastr: ToastrService) { }

  ngOnInit() {
    this.resetForm();
  }

  resetForm(form?: NgForm) {
    if (form != null) {
      form.reset();
    }
    this.userCreditCardService.selectedUserCreditCard = {
      id: null,
      cardNumber: null,
      cardType: '',
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
