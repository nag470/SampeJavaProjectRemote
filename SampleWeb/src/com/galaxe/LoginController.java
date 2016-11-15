package com.galaxe;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
	
	@RequestMapping(value=EmpRestURIConstants.DUMMY_EMP, method=RequestMethod.GET)
	@ResponseBody public Employee getDummyEmployee(){
		Employee e=new Employee();
		e.setId(100);
		e.setName("nagendra");
		e.setCreatedDate(new Date());
		hm.put(e.getId(), e);
		return e;	
		
	}
	@RequestMapping(value=EmpRestURIConstants.CREATE_EMP, method=RequestMethod.POST)
	@ResponseBody public Employee createEmployee(@RequestBody Employee e){
		e.setCreatedDate(new Date());
		hm.put(e.getId(), e);
		return e;	
		
	}
	
	@RequestMapping(value=EmpRestURIConstants.GET_EMP, method=RequestMethod.GET)
	@ResponseBody public Employee getEmployee(@PathVariable("id") int id){
		return hm.get(id);	
		
	}
	
	@RequestMapping(value=EmpRestURIConstants.GET_ALL_EMP, method=RequestMethod.GET)
	@ResponseBody public List<Employee> getAllEmployee(){
		List<Employee> emps = new ArrayList<Employee>();
		Set<Integer> empIdKeys = hm.keySet();
		for(Integer i : empIdKeys){
			emps.add(hm.get(i));
		}
		return emps;
	}
	@RequestMapping(value=EmpRestURIConstants.DELETE_EMP, method=RequestMethod.DELETE)
	@ResponseBody public String deleteEmployee(@PathVariable("id") int id){
		Employee em=hm.get(id);
		hm.remove(em.getId(), em);
		return "deleted successfully:"+em.getId();	
		
	} 
	List<Person> l=new ArrayList<Person>();
	@RequestMapping(value="/login", method=RequestMethod.GET)
	 public ModelAndView getCredentials(@ModelAttribute Person p){
		l.add(p);
		 return new ModelAndView("hellopage","listPersons",l);
		
	}
}
