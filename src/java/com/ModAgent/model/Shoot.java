/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ModAgent.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import org.hibernate.annotations.Cascade;

/**
 *
 * @author boniface
 */
@Entity
public class Shoot implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shootNr;
    private String shootName;
    private String place;
    //private Date date;
    private int duration;
    private String magName;
    private String magDescription;
    @OneToMany(cascade = {CascadeType.ALL})
    //@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE,
      //  org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
    @JoinColumn(name = "magName") //"shootNr"
    private List<Magazine> magazines;
    @OneToMany(cascade = {CascadeType.ALL})
    //@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE,
      //  org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
    @JoinColumn(name = "Shoot_nr")
    private List<Model> models;

    public Long getShootNr() {
        return shootNr;
    }

    public void setShootNr(Long shootNr) {
        this.shootNr = shootNr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shootNr != null ? shootNr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shoot)) {
            return false;
        }
        Shoot other = (Shoot) object;
        return (this.shootNr != null || other.shootNr == null) && (this.shootNr == null || this.shootNr.equals(other.shootNr));
    }

    @Override
    public String toString() {
        return "com.ModAgent.model.Shoot[id=" + shootNr + "]";
    }

    /**
     * @return the courseName
     */
    public String getShootName() {
        return shootName;
    }

    /**
     * @param shootName the courseName to set
     */
    public void setShootName(String shootName) {
        this.shootName = shootName;
    }

    /**
     * @return the courseCode
     */
    public String getMagName() {
        return magName;
    }

    /**
     * @param magName the courseCode to set
     */
    public void setMagName(String magName) {
        this.magName = magName;
    }

    /**
     * @return the courseOffering
     */
    public String getMagDescription() {
        
        return magDescription;
    }
 
    /**
     * @param magDescription the courseOffering to set
     */
    public void setMagDescription(String magDescription) {
        this.magDescription = magDescription;
    }

    /**
     * @return the subjects
     */
    public List<Magazine> getMagazines() {
        return magazines;
    }

    /**
     * @param magazines the subjects to set
     */
    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    /**
     * @return the students
     */
    public List<Model> getModels() {
        return models;
    }

    /**
     * @param models the students to set
     */
    public void setModels(List<Model> models) {
        this.models = models;
    }
}
