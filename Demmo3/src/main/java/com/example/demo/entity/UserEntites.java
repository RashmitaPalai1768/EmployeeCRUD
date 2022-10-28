package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee1")
public class UserEntites {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int e_id;
		private String e_name;
		private String e_add;
		private double e_salary;   
		public String getE_add() {
			return e_add;
		}
		public void setE_add(String e_add) {
			this.e_add = e_add;
		}
		
		public int getE_id() {  
			return e_id;
		}
		public void setE_id(int e_id) {
			this.e_id = e_id;
		}
		public String getE_name() {
			return e_name;
		}
		public void setE_name(String e_name) {
			this.e_name = e_name;
		}
		public double getE_salary() {
			return e_salary;
		}
		public void setE_salary(double e_salary) {
			this.e_salary = e_salary;
		}
		public UserEntites(String e_name, String e_add, double e_salary) {
			super();
			this.e_name = e_name;
			this.e_add = e_add;
			this.e_salary = e_salary;
		}
		public UserEntites() {
			
			// TODO Auto-generated constructor stub
		}
		
		
		
}
