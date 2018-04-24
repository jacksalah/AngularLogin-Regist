package sw.angular.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import sw.angular.demo.Entity.Brand;

public interface Brand_Repository extends CrudRepository<Brand,String> {

}
