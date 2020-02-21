package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("*** Test 1: department findById ***");
		System.out.print("Enter the Id to find: ");
		int id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		System.out.println(dep);
		System.out.println();
		
		
		sc.close();
	}
}
