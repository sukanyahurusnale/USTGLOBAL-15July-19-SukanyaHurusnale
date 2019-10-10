import { Pipe, PipeTransform } from '@angular/core';
import { User } from './users/user';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(user: User[], searchValue: string): User[] {
    if ( searchValue === undefined) {
return user;
    } else {
      return user.filter(data => {
return data.name.toLowerCase().includes(searchValue.toLowerCase());
        } );
    }
  }

}
