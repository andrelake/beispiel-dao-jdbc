package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Books");
		Seller seller = new Seller(12, "John", "john@gmail.com", new Date(), 2000.0, dep);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println(dep);
		System.out.println(seller);
	}

}
