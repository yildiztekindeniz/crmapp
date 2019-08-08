package deniz.crm.service;

import deniz.crm.entity.Parfum;
import deniz.crm.repository.ParfumRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ParfumService {

    public List<Parfum> findAll();
    public void save(Parfum parfum);







}
