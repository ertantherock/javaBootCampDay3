package oopWithOneLayeredApp.dataAccess;

//Bir paketten başka bir paketi kullanmak istiyorsak import etmemiz gerekiyor.
import oopWithOneLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//Sadece ve sadece DB erişim kodları buraya yazılır.
		System.out.println("JDBC ile Veri Tabanına Eklendi.");
	}

}
