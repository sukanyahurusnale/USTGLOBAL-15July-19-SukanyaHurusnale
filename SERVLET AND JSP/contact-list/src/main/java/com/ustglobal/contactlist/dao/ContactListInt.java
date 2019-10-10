package com.ustglobal.contactlist.dao;

import com.ustglobal.contactlist.dto.ContactBean;

public interface ContactListInt {
	
	 public ContactBean login(String name,String password);
	 public  ContactBean register(ContactBean b);
	 public boolean deleteContact(String name);
	 public ContactBean searchContact(String name);

}
