package net.martagir.DutyManagementSystem.service;

import net.martagir.DutyManagementSystem.dao.RankDao;
import net.martagir.DutyManagementSystem.model.Rank;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 31.05.2018.
 */
@Service
public class RankServiceImpl {
    private RankDao rankDao;

    public void setRankDao(RankDao rankDao) {
        this.rankDao = rankDao;
    }

    @Transactional
    public void addRank(Rank rank) {
        this.rankDao.addRank(rank);
    }

 
    @Transactional
    public void updateRank(Rank rank) {
        this.rankDao.updateRank(rank);
    }

    
    @Transactional
    public void removeRank(int id) {
        this.rankDao.removeRank(id);
    }

    
    @Transactional
    public Rank getRankById(int id) {
        return this.rankDao.getRankById(id);
    }

    
    @Transactional
    public List<Rank> listRanks() {
        return this.rankDao.listRanks();
    }
}
