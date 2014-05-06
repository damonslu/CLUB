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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author boniface
 */
@Entity
public class ModelShoot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numberOfQuestions;
    private int totalmarks;
    private int marksScored;
    private int testNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfTest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelShoot)) {
            return false;
        }
        ModelShoot other = (ModelShoot) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cput.model.Assessement[id=" + id + "]";
    }

    /**
     * @return the numberOfQuestions
     */
    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    /**
     * @param numberOfQuestions the numberOfQuestions to set
     */
    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    /**
     * @return the totalmarks
     */
    public int getTotalmarks() {
        return totalmarks;
    }

    /**
     * @param totalmarks the totalmarks to set
     */
    public void setTotalmarks(int totalmarks) {
        this.totalmarks = totalmarks;
    }

    /**
     * @return the marksScored
     */
    public int getMarksScored() {
        return marksScored;
    }

    /**
     * @param marksScored the marksScored to set
     */
    public void setMarksScored(int marksScored) {
        this.marksScored = marksScored;
    }

    /**
     * @return the testNumber
     */
    public int getTestNumber() {
        return testNumber;
    }

    /**
     * @param testNumber the testNumber to set
     */
    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    /**
     * @return the dateOfTest
     */
    public Date getDateOfTest() {
        return dateOfTest;
    }

    /**
     * @param dateOfTest the dateOfTest to set
     */
    public void setDateOfTest(Date dateOfTest) {
        this.dateOfTest = dateOfTest;
    }

}
