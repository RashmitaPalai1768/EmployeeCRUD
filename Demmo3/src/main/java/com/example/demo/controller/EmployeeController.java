package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.UserEntites;
import com.example.demo.repository.EmployeeRepo;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo er;
	
	@GetMapping("/emp")
	public String home() {
		return "index";
	}
	
	@PostMapping("/emp")
	public String add(@ModelAttribute("ue") UserEntites ue) {
		er.save(ue);
		return "success"; 
	}
	@GetMapping("/viewAll")
	public String view(Model m) {
		m.addAttribute("user", er.findAll());
		
		return "view";
	}
		
	@GetMapping("/Edit/{id}")
	public String update(@PathVariable int id,Model m) {
		//Optional<UserEntites> ee=er.findById(id);
		UserEntites ee=er.findById(id).get();
		m.addAttribute("ee",ee);
		return "index1";
		//return "redirect:/";  
	}
	
	@PostMapping("Edit/upd")
	public String up(@ModelAttribute UserEntites ue) {
		er.save(ue);
		return "redirect:/viewAll";
	}
	
	@GetMapping("/Delete/{id}")
	public String delete(@PathVariable int id,Model m) {
		er.deleteById(id);
		return "redirect:/viewAll";
	}
	
	
}
