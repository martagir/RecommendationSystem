package net.martagir.DutyManagementSystem.model;

import javax.persistence.*;

/**
 * Created by Marat <martagir@yandex.ru> on 29.03.2018.
 */
public class Rank {
    @Entity
    @Table(name = "RANKS")
    public class Soldier {
        @Id
        @Column(name = "ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "NAME")
        private String name;

        @Column(name = "SHORTNAME")
        private String shortName;
    }
}
