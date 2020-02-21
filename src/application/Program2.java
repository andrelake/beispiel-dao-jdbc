package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("*** Test 1: department findById ***");
//		System.out.print("Enter the Id to find: ");
//		int id = sc.nextInt();
//		Department dep = departmentDao.findById(id);
//		System.out.println(dep);
		
//		System.out.println("\n*** Test 2: department findAll ***");
//		List<Department> list = departmentDao.findAll();
//		for(Department x : list) {
//			System.out.println(x);
//		}

//		System.out.println("\n*** Test 3: department insert ***");
//		Department dep = new Department(null, "Music");
//		departmentDao.insert(dep);
//		System.out.println("Inserted new Department: id=" + dep.getId() + " name=" + dep.getName());
		
//		System.out.println("\n*** Test 4: department update ***");
//		Department dep = departmentDao.findById(3);
//		dep.setName("Food");
//		departmentDao.update(dep);
//		System.out.println("Updated");
		
		System.out.println("\n*** Test 5: department deleteById ***");
		System.out.print("Enter the id to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted");
		
		sc.close();
	}
}
