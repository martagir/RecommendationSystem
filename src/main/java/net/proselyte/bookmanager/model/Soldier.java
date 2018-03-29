package net.proselyte.bookmanager.model;

import javax.persistence.*;

/**
 * Created by Marat on 26.03.2018.
 */
@Entity
@Table(name = "SOLDIERS")
public class Soldier {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "epb")
    private int epb;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MIDDLENAME")
    private String middleName;

    @Column(name = "ISACTIVE")
    private boolean isActive;

    @Column(name = "RANK_ID")
    private int rank_id;

    @Column(name = "ISOLD")
    private boolean isOld;

    @Column(name = "DATEOFCONSCRIPTION")
    private String dateOfConscription;

    @Column(name = "MILITARYCARD")
    private String militaryCard;

    @Column(name = "ISONYSC")
    private boolean isOnYSC;

    @Column(name = "ISONHOLIDAY")
    private boolean isOnHoliday;

    @Column(name = "CANBEDUTYMASTER")
    private boolean canBeDutyMaster;

    @Column(name = "ISINHOSPITAL")
    private boolean isInHospital;

    @Column(name = "NOTICE")
    private String notice;
}
