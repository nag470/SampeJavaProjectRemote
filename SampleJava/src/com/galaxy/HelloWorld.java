package com.galaxy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class HelloWorld {

	public static void main(String[] args) throws JAXBException, IOException {
		 /*JAXBContext contextObj = JAXBContext.newInstance(Employee.class);  
		  
		    Marshaller marshallerObj = contextObj.createMarshaller();  
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    Employee e=new Employee();
		    e.setId(1);e.setFirstname("nagendra");
		    e.setLastName("neeli");
		    e.setState("andhra");
		    marshallerObj.marshal(e, new FileOutputStream("employee.xsd")); */ 
		
		/*FileOutputStream fis=new FileOutputStream("nag.txt");
		String s="welcome to galaxy";
		fis.write(s.getBytes());
		fis.close();
		System.out.println("success...");  
		
		FileInputStream fos=new FileInputStream("nag.txt");
		int i=0;
		while((i=fos.read())!=-1){
			System.out.print((char)i);
		}*/
			
		Student s1=new Student(20, "nag", "bnglre");
		Student s2=new Student(15, "pavan", "andhra");
		Student s3=new Student(30, "arun", "hyderabada");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al,new StudComp());
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student s=(Student) it.next();
			System.out.println(s.age +" "+s.getName() +" "+s.getCity());
		}
	}

}
