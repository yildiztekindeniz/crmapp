package deniz.crm.service;

import deniz.crm.entity.Essence;
import deniz.crm.repository.EssenceRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EssenceServiceImpl implements EssenceService {
    private EssenceRepository essenceRepository;
    @Override
    public List<Essence> findAll() {

        List<Essence> essences=essenceRepository.findAll();
        return essences;
    }

    @Override
    public void save(Essence essence) {

        essenceRepository.save(essence);

    }
}
