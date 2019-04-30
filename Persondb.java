package com.hcl.db;

import java.util.HashMap;
import java.util.Map;
import com.hcl.model.Person;
import matrix.db.Context;
import matrix.db.JPO;
import matrix.util.MatrixException;

public class Persondb
{
	public Persondb() {
	}
	
	
	public Person checkPersonLicense(Context context,Person person) 
	{
		Person personObj=new Person();
		try {
			
			/*p1.setUsername(person.getUsername()+"1");
			p1.setFirstname(person.getFirstname()+"1");
			p1.setLastname(person.getLastname()+"1");
			p1.setOrg(person.getOrg()+"1");
			p1.setRole(person.getRole()+"1");*/

			Map hmArgs = new HashMap();
			String[] asConstructor = {};
			hmArgs.put("username", person.getUsername());

			String[] methArgs = JPO.packArgs(hmArgs);

			String strUserUpdateDetails = (String) JPO.invoke(context, "HCLPLMPersonUtil", asConstructor, "checkLicenseForPerson", methArgs,String.class);
			System.out.println("Person Details :: " + strUserUpdateDetails);
			
			personObj.setUsername(person.getUsername());
			personObj.setFirstname(person.getFirstname());
			personObj.setLastname(person.getLastname());
			personObj.setOrg(person.getOrg());
			personObj.setRole(person.getRole());
			
			
			
			personObj.setMsg("OK");
			personObj.setData(strUserUpdateDetails);

		} catch (MatrixException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personObj;
	}

	public Person updatePerson(Context context,Person person) 
	{
		Person personObj=new Person();
		try {
			
			/*p1.setUsername(person.getUsername()+"1");
			p1.setFirstname(person.getFirstname()+"1");
			p1.setLastname(person.getLastname()+"1");
			p1.setOrg(person.getOrg()+"1");
			p1.setRole(person.getRole()+"1");*/

			Map hmArgs = new HashMap();
			String[] asConstructor = {};
			hmArgs.put("username", person.getUsername());
			hmArgs.put("org", person.getOrg());
			hmArgs.put("firstname", person.getFirstname());
			hmArgs.put("lastname", person.getLastname());
			hmArgs.put("role", person.getRole());

			String[] methArgs = JPO.packArgs(hmArgs);

			String strUserUpdateDetails = (String) JPO.invoke(context, "HCLPLMPersonUtil", asConstructor, "updatePerson", methArgs,String.class);
			System.out.println("Person Details :: " + strUserUpdateDetails);
			
			personObj.setUsername(person.getUsername());
			personObj.setFirstname(person.getFirstname());
			personObj.setLastname(person.getLastname());
			personObj.setOrg(person.getOrg());
			personObj.setRole(person.getRole());
			
			
			
			personObj.setMsg("OK");
			personObj.setData(strUserUpdateDetails);

		} catch (MatrixException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personObj;
	}
	public Person createPerson(Context context, Person person) 
	{
		Person p1=new Person();
		try {
			
			/*		p1.setUsername(person.getUsername()+"1");
			p1.setFirstname(person.getFirstname()+"1");
			p1.setLastname(person.getLastname()+"1");
			p1.setOrg(person.getOrg()+"1");
			p1.setRole(person.getRole()+"1");*/

			Map hmArgs = new HashMap();
			String[] asConstructor = {};
			hmArgs.put("username", person.getUsername());
			hmArgs.put("org", person.getOrg());
			hmArgs.put("firstname", person.getFirstname());
			hmArgs.put("lastname", person.getLastname());
			hmArgs.put("role", person.getRole());

			String[] methArgs = JPO.packArgs(hmArgs);

			// get all locations connected to partmaster by relationship Manufacturing
			// Responsibility.
			String strUserUpdateDetails = (String) JPO.invoke(context, "HCLPLMPersonUtil", asConstructor, "updatePerson", methArgs,String.class);
			System.out.println("Person Details :: " + strUserUpdateDetails);

			p1.setMsg("OK");
			p1.setData(strUserUpdateDetails);

		} catch (MatrixException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p1;
	}
	
	
	
	
	
}
