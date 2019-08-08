package deniz.crm.repository;

import deniz.crm.entity.Essence;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EssenceRepository extends MongoRepository<Essence,String> {


}
