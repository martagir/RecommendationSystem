package net.martagir.DutyManagementSystem.dao;

import net.martagir.DutyManagementSystem.model.Soldier;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Marat <martagir@yandex.ru> on 29.05.2018.
 */
@Repository
public class SoldierDaoImpl implements SoldierDao {
    private static final Logger logger = LoggerFactory.getLogger(SoldierDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addSoldier(Soldier soldier) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(soldier);
        logger.info("Soldier successfully saved. Soldier details: " + soldier);
    }

    @Override
    public void updateSoldier(Soldier soldier) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(soldier);
        logger.info("Soldier successfully update. Soldier details: " + soldier);
    }

    @Override
    public void removeSoldier(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Soldier soldier = (Soldier) session.load(Soldier.class, new Integer(id));

        if (soldier != null) {
            session.delete(soldier);
        }
        logger.info("Soldier successfully removed. Soldier details: " + soldier);
    }

    @Override
    public Soldier getSoldierById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Soldier soldier = (Soldier) session.load(Soldier.class, new Integer(id));
        logger.info("Soldier successfully loaded. Soldier details: " + soldier);

        return soldier;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Soldier> listSoldiers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Soldier> soldierList = session.createQuery("from Soldiers").list();

        for (Soldier soldier : soldierList) {
            logger.info("Soldier list: " + soldier);
        }

        return soldierList;
    }
}
