package oopWithOneLayeredApp.dataAccess;

import oopWithOneLayeredApp.entities.Product;

//Interfaceler sadece method imzasını barındırabilir.
public interface ProductDao {
	void add(Product product);

}
