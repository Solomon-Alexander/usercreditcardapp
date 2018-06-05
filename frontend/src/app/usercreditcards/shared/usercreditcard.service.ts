import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions, RequestMethod } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

import { UserCreditCard } from './usercreditcard.model';

@Injectable()
export class UserCreditCardService {

  selectedUserCreditCard: UserCreditCard;
  userCreditCardList: UserCreditCard[];
  constructor(private http: Http) { }

  postUserCreditCard(conf: UserCreditCard) {
    const body = JSON.stringify(conf);
    const headerOptions = new Headers({ 'Content-Type': 'application/json' });
    const requestOptions = new RequestOptions({ method: RequestMethod.Post, headers: headerOptions });
    return this.http.post('http://localhost:8081/api/ang/usercreditcard', body, requestOptions).map(x => x.json());
  }
  putUserCreditCard(id, conf) {
    const body = JSON.stringify(conf);
    const headerOptions = new Headers({ 'Content-Type': 'application/json' });
    const requestOptions = new RequestOptions({ method: RequestMethod.Put, headers: headerOptions });
    return this.http.put('http://localhost:8081/api/ang/usercreditcard/' + id,
      body,
      requestOptions).map(res => res.json());
  }
  getUserCreditCardList() {
    this.http.get('http://localhost:8081/api/ang/usercreditcards')
      .map((data: Response) => {
        return data.json() as UserCreditCard[];
      }).toPromise().then(x => {
        this.userCreditCardList = x;
      });
  }
  deleteUserCreditCard(id: number) {
    return this.http.delete('http://localhost:8081/api/ang/usercreditcard/' + id).map(res => res.json());
  }
}
