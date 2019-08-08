package deniz.crm.service;

import deniz.crm.entity.Essence;

import java.util.List;

public interface EssenceService {

    public List<Essence> findAll();
    public void save(Essence essence);
}
