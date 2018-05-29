package net.martagir.DutyManagementSystem.dao;

import net.martagir.DutyManagementSystem.model.Soldier;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 29.05.2018.
 */
public interface SoldierDao {
    public void addSoldier(Soldier soldier);

    public void updateSoldier(Soldier boldier);

    public void removeSoldier(int id);

    public Soldier getSoldierById(int id);

    public List<Soldier> listSoldiers();
}
