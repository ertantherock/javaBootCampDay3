package oopWithOneLayeredApp;

import oopWithOneLayeredApp.business.ProductManager;
import oopWithOneLayeredApp.core.logging.DataBaseLogger;
import oopWithOneLayeredApp.core.logging.FileLogger;
import oopWithOneLayeredApp.core.logging.Logger;
import oopWithOneLayeredApp.core.logging.MailLogger;
import oopWithOneLayeredApp.dataAccess.HibernateProductDao;
import oopWithOneLayeredApp.dataAccess.JdbcProductDao;
import oopWithOneLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception  {
		Product product = new Product(1,"Iphone",30000);
		
		Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};	
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		
		productManager.add(product);
		

	}

}
