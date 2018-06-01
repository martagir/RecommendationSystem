package net.martagir.DutyManagementSystem.dao;

import net.martagir.DutyManagementSystem.model.Rank;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 31.05.2018.
 */
public interface RankDao {
    public void addRank(Rank rank);

    public void updateRank(Rank rank);

    public void removeRank(int id);

    public Rank getRankById(int id);

    public List<Rank> listRanks();
}
