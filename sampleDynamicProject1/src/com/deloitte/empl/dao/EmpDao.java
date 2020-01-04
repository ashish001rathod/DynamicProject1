package com.deloitte.empl.dao;

import java.util.List;

import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	int deleteEmp(int empno);
	List<Emp> getEmpls();
	Emp getEmpByCode(int empno);

}
