package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		

		Department obj = new Department(1, "Teste");
		
		System.out.println(obj);
		
		Seller seller = new Seller(1, "teste", "testedaf", new Date(), 3000.0, obj);
		
		System.out.println(seller);
	}

}
