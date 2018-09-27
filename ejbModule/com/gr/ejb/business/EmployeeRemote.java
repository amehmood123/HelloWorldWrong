package com.gr.ejb.business;

import javax.ejb.Remote;

import com.gr.ejb.entity.Employee;

@Remote
public interface EmployeeRemote {
	  public boolean addEmployee(Employee employee);
}
