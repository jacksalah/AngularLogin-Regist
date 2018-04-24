package sw.angular.demo.Repository;


import org.springframework.data.repository.CrudRepository;
import sw.angular.demo.Entity.Platform;

public interface PlatformRepritory extends CrudRepository<Platform,String> {
}
