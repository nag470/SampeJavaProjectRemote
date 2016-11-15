package com.nag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/emp")
public class SampleCRUD {
	List<Employee> l=new ArrayList<Employee>();
	
	@POST
	@Path("/createEmp")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> createEmp(Employee er){
		l.add(er);
		return l;
	}
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createEmp(@FormParam("name") String name,
			@FormParam("age") int age){
		return Response.status(200).entity("addUser is called, name : " + name + ", age : " + age).build();
	}
	
	@GET
	@Path("/getEmp")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmp(){
		Employee er=new Employee();
		er.setName("pawan");
		er.setCity("telangana");
		l.add(er);
		return l;
	}
	
	@PUT
	@Path("/updateEmp")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateEmp(@PathParam("name") String name){
		Employee er=new Employee();
		er.setName(name);
		er.setCity("telangana");
		
		er.setName(er.getName());
		l.add(er);
		return er;
	}
	@DELETE
	@Path("/deteleEmp/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> deleteEmp(@PathParam("name") String name){
		Employee er=new Employee();
		er.setName("pawan");
		er.setCity("telangana");
		Employee er1=new Employee();
		er1.setName("kalyan");
		er1.setCity("andhra");
		l.add(er);
		l.add(er1);
		Iterator<Employee> it=l.iterator();
		while(it.hasNext()){
			Employee e=it.next();
			if(e.getName().equals(name)){
				it.remove();
			}
		}
		return l;
	}
	

}
