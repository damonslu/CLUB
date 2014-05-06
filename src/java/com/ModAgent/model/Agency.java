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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author boniface
 */
@Entity
public class Agency implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agency_nr;
    private String name;
    
    @OneToOne
     private Person personInformation;
    //@ManyToOne
     //private Faculty faculty;
    @ManyToMany
     private List<Magazine> magazines;

    public Long getAgentNr() {
        return agency_nr;
    }

    public void setAgencyNr(Long agency_nr) {
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
        if (!(object instanceof Agency)) {
            return false;
        }
        Agency other = (Agency) object;
        if ((this.agency_nr == null && other.agency_nr != null) || (this.agency_nr != null && !this.agency_nr.equals(other.agency_nr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ModAgent.model.Agency[id=" + agency_nr + "]";
    }

    /**
     * @return the staffNumber
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the staffNumber to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the personInformation
     */
    public Person getPersonInformation() {
        return personInformation;
    }

    /**
     * @param personInformation the personInformation to set
     */
    public void setPersonInformation(Person personInformation) {
        this.personInformation = personInformation;
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
      //  this.faculty = faculty;
    //}

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

  
}
