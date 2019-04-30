package com.hcl.resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dassault_systemes.platform.restServices.RestService;
import com.hcl.model.Person;
import com.hcl.services.PersonService;
import com.matrixone.apps.framework.ui.UIUtil;

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class PersonResource extends RestService
{
	@POST
	@Path("/createPerson")
	public Person createPerson(@javax.ws.rs.core.Context HttpServletRequest paramHttpServletRequest,Person personInput)
	{
		Person newPerson=null;
		try 
		{
			if(UIUtil.isNotNullAndNotEmpty(personInput.toString()))
			{
				System.out.println("Person input check (createPerson)====>"+personInput.toString());
				matrix.db.Context context= authenticate(paramHttpServletRequest);	
				newPerson=new PersonService().createPersonService(context,personInput);
			}
			else
			{
				throw new IllegalArgumentException("failed to deserialize JSON entity: " + "empty/null entity stream");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return newPerson;
	}
	
	@PUT
	@Path("/updatePerson")
	public Person updatePerson(@javax.ws.rs.core.Context HttpServletRequest paramHttpServletRequest,Person personInput)
	{
		Person newPerson=null;
		try 
		{
			if(UIUtil.isNotNullAndNotEmpty(personInput.toString()))
			{
				System.out.println("Person input check (updatePerson)====>"+personInput.toString());
				matrix.db.Context context= authenticate(paramHttpServletRequest);	
				newPerson=new PersonService().updatePersonService(context,personInput);
			}
			else
			{
				throw new IllegalArgumentException("failed to deserialize JSON entity: " + "empty/null entity stream");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return newPerson;
	}
	
	@POST
	@Path("/TestCreatePerson")
	public Person testCreatePerson(@javax.ws.rs.core.Context HttpServletRequest paramHttpServletRequest,Person personInput)
	{
		Person newPerson=null;
		try 
		{
			if(UIUtil.isNotNullAndNotEmpty(personInput.toString()))
			{
				System.out.println("TestCreatePerson Check====>"+personInput.toString());
				matrix.db.Context context= authenticate(paramHttpServletRequest);	
				newPerson=new PersonService().createPersonService(context,personInput);
			}
			else
			{
				throw new IllegalArgumentException("failed to deserialize JSON entity: " + "empty/null entity stream");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return newPerson;
	}
	
	@POST
	@Path("/checklicense")
	public Person checkPersonLicense(@javax.ws.rs.core.Context HttpServletRequest paramHttpServletRequest,Person personInput)
	{
		Person newPerson=null;
		try 
		{
			if(UIUtil.isNotNullAndNotEmpty(personInput.toString()))
			{
				System.out.println("checkPersonLicense() :::::::::  Check====>"+personInput.toString());
				matrix.db.Context context= authenticate(paramHttpServletRequest);	
				newPerson=new PersonService().verifyPersonLicense(context,personInput);
			}
			else
			{
				throw new IllegalArgumentException("failed to deserialize JSON entity: " + "empty/null entity stream");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return newPerson;
	}
}
