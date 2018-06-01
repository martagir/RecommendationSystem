package net.martagir.DutyManagementSystem.model;

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

    private String rank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEpb() {
        return epb;
    }

    public void setEpb(int epb) {
        this.epb = epb;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getRank_id() {
        return rank_id;
    }

    public void setRank_id(int rank_id) {
        this.rank_id = rank_id;
    }

    public boolean isOld() {
        return isOld;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    public String getDateOfConscription() {
        return dateOfConscription;
    }

    public void setDateOfConscription(String dateOfConscription) {
        this.dateOfConscription = dateOfConscription;
    }

    public String getMilitaryCard() {
        return militaryCard;
    }

    public void setMilitaryCard(String militaryCard) {
        this.militaryCard = militaryCard;
    }

    public boolean isOnYSC() {
        return isOnYSC;
    }

    public void setOnYSC(boolean onYSC) {
        isOnYSC = onYSC;
    }

    public boolean isOnHoliday() {
        return isOnHoliday;
    }

    public void setOnHoliday(boolean onHoliday) {
        isOnHoliday = onHoliday;
    }

    public boolean isCanBeDutyMaster() {
        return canBeDutyMaster;
    }

    public void setCanBeDutyMaster(boolean canBeDutyMaster) {
        this.canBeDutyMaster = canBeDutyMaster;
    }

    public boolean isInHospital() {
        return isInHospital;
    }

    public void setInHospital(boolean inHospital) {
        isInHospital = inHospital;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

//    @ManyToOne
//    @PrimaryKeyJoinColumn
    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", militaryCard='" + militaryCard + '\'' +
                '}';
    }


}
