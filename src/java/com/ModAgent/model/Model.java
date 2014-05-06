/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ModAgent.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author boniface
 */
@Entity
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long model_Id;
    private String gender;
    private String name;
    private Long agency_nr;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfRegistration;

    public Model() {

    }

    @ManyToOne
    private Shoot shoot;

    @OneToOne
    private Person modelInformation;
    
    @ManyToMany
    private List<Magazine> magazines;
    //@ManyToOne
    //private Faculty faculty;

    public Long getModel_Id() {
        return model_Id;
    }

    public void setModel_Id(Long model_Id) {
        this.model_Id = model_Id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (model_Id != null ? model_Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Model)) {
            return false;
        }
        Model other = (Model) object;
        return (this.model_Id != null || other.model_Id == null) && (this.model_Id == null || this.model_Id.equals(other.model_Id));
    }

    @Override
    public String toString() {
        return "com.ModAgent.model.Model[id=" + model_Id + "]";
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dateOfRegistration
     */
    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    /**
     * @param dateOfRegistration the dateOfRegistration to set
     */
    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    /**
     * @return the course
     */
    public Shoot getShoot() {
        return shoot;
    }

    /**
     * @param shoot the course to set
     */
    public void setShoot(Shoot shoot) {
        this.shoot = shoot;
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
     * @return the faculty
     */
    //public Faculty getFaculty() {
        //return faculty;
    //}

    /**
     * @param faculty the faculty to set
     */
    //public void setFaculty(Faculty faculty) {
        //this.faculty = faculty;
    
}
