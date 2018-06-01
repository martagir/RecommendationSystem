package net.martagir.DutyManagementSystem.dao;

import net.martagir.DutyManagementSystem.model.Rank;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 31.05.2018.
 */
@Repository
public class RankDaoImpl implements RankDao {
    private static final Logger logger = LoggerFactory.getLogger(SoldierDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addRank(Rank rank) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(rank);
        logger.info("Rank successfully saved. Rank details: " + rank);
    }

    @Override
    public void updateRank(Rank rank) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(rank);
        logger.info("rank successfully update. Rank details: " + rank);
    }

    @Override
    public void removeRank(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Rank rank = (Rank) session.load(Rank.class, new Integer(id));

        if (rank != null) {
            session.delete(rank);
        }
        logger.info("Rank successfully removed. Rank details: " + rank);
    }

    @Override
    public Rank getRankById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Rank rank = (Rank) session.load(Rank.class, new Integer(id));
        logger.info("Rank successfully loaded. Rank details: " + rank);

        return rank;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Rank> listRanks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Rank> rankList = session.createQuery("from Rank").list();

//        for (Rank rank : rankList) {
//            logger.info("rank list: " + rank);
//        }

        return rankList;
    }
}
