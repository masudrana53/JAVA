import { Component, OnInit } from '@angular/core';
import { EmployeeModel } from './employee.model';
import { ApiService } from '../services/api.service';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent implements OnInit {

  employeeModel : EmployeeModel=new EmployeeModel();
  formValue !: FormGroup;

  employeeData: any;



  constructor(private api: ApiService, private formBuilder: FormBuilder) {

  }

  ngOnInit(): void {
    this.formValue = this.formBuilder.group({
      firstName: [''],
      lastName: [''],
      email: [''],
      cell: [''],
      salary: [''],

    });

    this.getAll();

  }

  saveEmployee() {

    
      this.employeeModel.firstName = this.formValue.value.firstName;
      this.employeeModel.lastName = this.formValue.value.lastName;
      this.employeeModel.email = this.formValue.value.email;
      this.employeeModel.cell = this.formValue.value.cell;
      this.employeeModel.salary = this.formValue.value.salary;
  
      this.api.employeePost(this.employeeModel)
        .subscribe(res => {
          console.log(res);
          alert("Employee Added")
          this.formValue.reset();
          this.getAll();
          
        },
          err => {
            alert("Data Not save")
          }
  
        )
    }


    getAll(){
      this.api.getAllEmployee()
      .subscribe(res => {
        this.employeeData=res;     
        
      })
    }

    deleteEmployee(row:any){
      this.api.deleteEmployee(row.id)
      .subscribe(res => {
        console.log(res);
        alert("Employee Deleted")
        this.formValue.reset();
        this.getAll();
        
      },
        err => {
          alert("Data Not Daved")
        }

      )

    }

    
  onEdite(row: any) {
    this.employeeModel.id=row.id;
    this.formValue.controls['firstName'].setValue(row.firstName);
    this.formValue.controls['lastName'].setValue(row.lastName);
    this.formValue.controls['email'].setValue(row.email);
    this.formValue.controls['cell'].setValue(row.cell);
    this.formValue.controls['salary'].setValue(row.salary);

  }

  employeeEdit(){

    this.employeeModel.firstName = this.formValue.value.firstName;
    this.employeeModel.lastName = this.formValue.value.lastName;
    this.employeeModel.email = this.formValue.value.email;
    this.employeeModel.cell = this.formValue.value.cell;
    this.employeeModel.salary = this.formValue.value.salary;

    this.api.editEmployee(this.employeeModel.id, this.employeeModel)
    .subscribe(res => {
      console.log(res);
      alert("Employee Updated")
      this.formValue.reset();
      this.getAll();
      
    },
      err => {
        alert("Data Not Update")
      }

    )

  }



}
