package Dc.app.Sampleboot;

//import dc.core.constants.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by vishnu on 5/28/16.
 */
public interface LocationMongoRepository extends MongoRepository<Location,String> {
       List<Location> findByState(String state);
}
