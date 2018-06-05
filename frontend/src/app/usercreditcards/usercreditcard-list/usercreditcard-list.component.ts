import { Component, OnInit } from '@angular/core';

import { UserCreditCardService } from '../shared/usercreditcard.service';
import { UserCreditCard } from '../shared/usercreditcard.model';
import { ToastrService } from 'ngx-toastr';
@Component({
  selector: 'app-usercreditcard-list',
  templateUrl: './usercreditcard-list.component.html',
  styleUrls: ['./usercreditcard-list.component.css']
})
export class UserCreditCardListComponent implements OnInit {

  constructor(private userCreditCardService: UserCreditCardService, private toastr: ToastrService) { }

  ngOnInit() {
    this.userCreditCardService.getUserCreditCardList();
  }

  showForEdit(conf: UserCreditCard) {
    this.userCreditCardService.selectedUserCreditCard = Object.assign({}, conf);
  }

  onDelete(id: number) {
    if (confirm('Are you sure to delete this record ?') === true) {
      this.userCreditCardService.deleteUserCreditCard(id)
      .subscribe(x => {
        this.userCreditCardService.getUserCreditCardList();
        this.toastr.warning('Deleted Successfully","configuration Register');
      });
    }
  }
}
