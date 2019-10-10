import { Injectable } from '@angular/core';

@Injectable({

providedIn:"root",


    })
export class UserService
{

    users=[
        {
            name:'sanjivani',
            company:'tcs'

        },
        {
            name:'sukanya',
            company:'ustglobal'
        }];


        printdetails()
    {
        console.log('function is executing');
    }

}

