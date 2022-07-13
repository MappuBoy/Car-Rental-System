package lk.ijse.carRental.service;

import lk.ijse.carRental.dto.DamadgeDTO;

import java.util.List;

public interface DamadgeService {
    void damadgeSave(DamadgeDTO damadgeDTO);
    void deletedamadge(String damadgeId);
    void updatedamadge(DamadgeDTO damadgeDTO);
    DamadgeDTO serachdamadge(String damadgeId);
    List<DamadgeDTO> getAlldamadge();
}

