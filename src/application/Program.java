package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("=== TESTE 1: Seller findByid ===");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.print("/=== TESTE 1: Seller findByid ===\\");
		
		System.out.println();
		
		System.out.println("=== TESTE 2: Seller findByidDepartmen ===");
		
		Department department = new  Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list){
			
			System.out.println(obj);
		}
		
		System.out.print("/=== TESTE 1: Seller findByidDepartmen ===\\");
		System.out.println("");
		
		System.out.println("=== TESTE 3: Seller findAll ===");
		
	    department = new  Department(2, null);
		
		list = sellerDao.findAll();
		
		for (Seller obj : list){
			
			System.out.println(obj);
		}
		
		System.out.print("/=== TESTE 3: Seller findAll ===\\");
	}

}
