import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-alticci',
  templateUrl: './alticci.component.html',
  styleUrls: ['./alticci.component.css']
})
export class AlticciComponent implements OnInit {

  constructor(private http: HttpClient) { }
  response: any[] = [];
  // inputValue: String = '';

  ngOnInit() {
  }

  calculateAlticci(inputValue: String){
    this.http
      .get('http://127.0.0.1:8080/alticci/' + inputValue, {})
      .subscribe(
        (response: any[]) => {
          console.log(JSON.stringify(response));
          this.response = response;
          console.log(this.response);
          // alert('Success');
        },
        (error) => {
          debugger;
          alert('Error : '+ error.error.responseCodeDescription);
        }
      )
  }
}
