package net.martagir.DutyManagementSystem.model;

import javax.persistence.*;

/**
 * Created by Marat <martagir@yandex.ru> on 29.03.2018.
 */
@Entity
@Table(name = "RANKS")
public class Rank {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SHORTNAME")
    private String shortName;

    @Override
    public String toString() {
        return "Rank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
