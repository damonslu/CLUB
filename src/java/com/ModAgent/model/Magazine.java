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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import org.hibernate.annotations.Cascade;

/**
 *
 * @author boniface
 */
@Entity
public class Magazine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agency_nr;
    private String magName;
    private String magDescription;
    private String magClassification;
    @ManyToOne
    private Magazine magazine;
    @OneToMany
    private List<ModelShoot> modelshoots;
    @ManyToMany(cascade = {CascadeType.ALL})
    //@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE,
        //org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
   
    private List<Model> models;
    //@ManyToMany(cascade = {CascadeType.ALL})
    //@Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE,
      //  org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
    
    private List<Agency> agencies;

    public Long getAgency_Nr() {
        return agency_nr;
    }

    public void setAgency_Nr(Long agency_nr) {
        this.agency_nr = agency_nr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agency_nr != null ? agency_nr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magazine)) {
            return false;
        }
        Magazine other = (Magazine) object;
        return (this.magName != null || other.magName == null) && (this.magName == null || this.magName.equals(other.magName));
    }

    @Override
    public String toString() {
        return "com.ModAgent.model.Magazine[id=" + magName + "]";
    }

    /**
     * @return the subjectName
     */
    public String getMagName() {
        return magName;
    }

    /**
     * @param magName the subjectName to set
     */
    public void setMagName(String magName) {
        this.magName = magName;
    }

    /**
     * @return the subjectCode
     */
    public String getMagDescription() {
        return magDescription;
    }

    /**
     * @param magDescription the subjectCode to set
     */
    public void setMagDescription(String magDescription) {
        this.magDescription = magDescription;
    }

    /**
     * @return the course
     */
    public String getMagClassification() {
        return magClassification;
    }

    /**
     * @param magClassification the course to set
     */
    public void setMagClassification(String magClassification) {
        this.magClassification = magClassification;
    }

    /**
     * @return the assessments
     */
    public List<ModelShoot> getModelShoot() {
        return modelshoots;
    }

    /**
     * @param modelshoots the assessments to set
     */
    public void setModelShoot(List<ModelShoot> modelshoots) {
        this.modelshoots = modelshoots;
    }

    /**
     * @return the students
     */
    public List<Model> getModel() {
        return models;
    }

    /**
     * @param models the students to set
     */
    public void setModels(List<Model> models) {
        this.models = models;
    }

    /**
     * @return the lecturers
     */
    public List<Agency> getAgency() {
        return agencies;
    }

    /**
     * @param agencies the lecturers to set
     */
    public void setAgency(List<Agency> agencies) {
        this.agencies = agencies;
    }
}
