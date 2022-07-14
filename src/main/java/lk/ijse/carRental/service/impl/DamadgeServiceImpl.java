package lk.ijse.carRental.service.impl;

import lk.ijse.carRental.dto.DamadgeDTO;
import lk.ijse.carRental.entity.Damadge;
import lk.ijse.carRental.repo.DamadgeRepo;
import lk.ijse.carRental.service.DamadgeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class DamadgeServiceImpl implements DamadgeService {
    @Autowired
    private DamadgeRepo repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public void damadgeSave(DamadgeDTO damadgeDTO) {
        if (!repo.existsById(damadgeDTO.getDamadgeId())){
            repo.save(mapper.map(damadgeDTO, Damadge.class));
        }else{
            throw new RuntimeException("Damage Already Exist..!");
        }
    }

    @Override
    public void deletedamadge(String damadgeId) {
        if (repo.existsById(damadgeId)) {
            repo.deleteById(damadgeId);
        } else {
            throw new RuntimeException("Please check the Damage Vehicle ID.. No Such Vehicle..!");
        }
    }

    @Override
    public void updatedamadge(DamadgeDTO damadgeDTO) {
        if (repo.existsById(damadgeDTO.getDamadgeId())) {
            repo.save(mapper.map(damadgeDTO, Damadge.class));
        } else {
            throw new RuntimeException("No Such Damage Vehicle To Update..! Please Check the ID..!");
        }
    }

    @Override
    public DamadgeDTO serachdamadge(String damadgeId) {
        if (repo.existsById(damadgeId)) {
            return mapper.map(repo.findById(damadgeId).get(), DamadgeDTO.class);
        } else {
            throw new RuntimeException("No Damage Vehicle For " + damadgeId + " ..!");
        }
    }

    @Override
    public List<DamadgeDTO> getAlldamadge() {
        return mapper.map(repo.findAll(), new TypeToken<List<DamadgeDTO>>() {
        }.getType());
    }
}
