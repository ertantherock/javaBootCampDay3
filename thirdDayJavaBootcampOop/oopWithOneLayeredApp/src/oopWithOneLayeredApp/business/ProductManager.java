package oopWithOneLayeredApp.business;

import java.util.List;

import oopWithOneLayeredApp.core.logging.Logger;
import oopWithOneLayeredApp.dataAccess.HibernateProductDao;
import oopWithOneLayeredApp.dataAccess.JdbcProductDao;
import oopWithOneLayeredApp.dataAccess.ProductDao;
import oopWithOneLayeredApp.entities.Product;
//Bir katman başka bir katmanın classını kullanıyorken sadece interface'inden erişim kurmalıdır.

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//iş kurallar
		if (product.getUnitPrice()<10 ) {
			throw new Exception("Ürünün fiyatı 10dan küçük olamaz.");
		} 
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
	}
		
	
	
	
};
