package net.martagir.DutyManagementSystem.service;

import net.martagir.DutyManagementSystem.model.Soldier;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 29.05.2018.
 */
public interface SoldierService {
    public void addSoldier(Soldier soldier);

    public void updateSoldier(Soldier soldier);

    public void removeSoldier(int id);

    public Soldier getSoldierById(int id);

    public List<Soldier> listSoldiers();
}
