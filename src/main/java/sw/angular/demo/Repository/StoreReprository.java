package sw.angular.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import sw.angular.demo.Entity.Store;

public interface StoreReprository extends CrudRepository<Store,String> {
}
