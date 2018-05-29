package net.martagir.DutyManagementSystem.service;

import net.martagir.DutyManagementSystem.dao.SoldierDao;
import net.martagir.DutyManagementSystem.model.Soldier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 29.05.2018.
 */
@Service
public class SoldierServiceImpl implements SoldierService {
    private SoldierDao soldierDao;

    public void setSoldierDao(SoldierDao soldierDao) {
        this.soldierDao = soldierDao;
    }

    @Override
    @Transactional
    public void addSoldier(Soldier soldier) {
        this.soldierDao.addSoldier(soldier);
    }

    @Override
    @Transactional
    public void updateSoldier(Soldier soldier) {
        this.soldierDao.updateSoldier(soldier);
    }

    @Override
    @Transactional
    public void removeSoldier(int id) {
        this.soldierDao.removeSoldier(id);
    }

    @Override
    @Transactional
    public Soldier getSoldierById(int id) {
        return this.soldierDao.getSoldierById(id);
    }

    @Override
    @Transactional
    public List<Soldier> listSoldiers() {
        return this.soldierDao.listSoldiers();
    }
}
