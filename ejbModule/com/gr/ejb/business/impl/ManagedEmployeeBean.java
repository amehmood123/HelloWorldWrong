package com.gr.ejb.business.impl;

import com.gr.ejb.business.EmployeeRemote;
import com.gr.ejb.entity.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class ManagedEmployeeBean
 */
@Stateless
public class ManagedEmployeeBean implements EmployeeRemote {

    /**
     * Default constructor. 
     */
	
	
	@PersistenceContext(unitName = "EmpMgmtPU")
    private EntityManager entityManager;
 
    public ManagedEmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean addEmployee(Employee employee) {
        entityManager.persist(employee);
        return true;
    }

}
