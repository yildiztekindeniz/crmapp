package deniz.crm.repository;

import deniz.crm.entity.Parfum;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParfumRepository extends MongoRepository<Parfum,String> {

}
