package sw.angular.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import sw.angular.demo.Entity.User;

public interface UserReprository extends CrudRepository<User,String>{
}
