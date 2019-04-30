package com.hcl.services;

import com.hcl.db.Persondb;
import com.hcl.model.Person;

import matrix.db.Context;

public class PersonService {

	public PersonService() {}
	
	public Person createPersonService(Context context,Person person)
	{
		return new Persondb().createPerson(context,person);
	}
	
	
	public Person updatePersonService(Context context,Person person)
	{
		return new Persondb().updatePerson(context,person);
	}
	
	public Person verifyPersonLicense(Context context,Person person)
	{
		return new Persondb().checkPersonLicense(context,person);
	}

}