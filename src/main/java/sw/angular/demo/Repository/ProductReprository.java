package sw.angular.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import sw.angular.demo.Entity.Product;

public interface ProductReprository extends CrudRepository<Product,String>{
}
