package sw.angular.demo.Repository;



import org.springframework.data.repository.CrudRepository;
import sw.angular.demo.Entity.Statistics;

public interface Statistics_Repository extends CrudRepository<Statistics,String> {
}
