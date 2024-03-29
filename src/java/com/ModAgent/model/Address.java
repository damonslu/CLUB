/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ModAgent.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author boniface
 */
@Entity
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String addressPhysical;
    private String addressPostal;
    private String postalCode;

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
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cput.model.Address[id=" + id + "]";
    }

    /**
     * @return the addressPhysical
     */
    public String getAddressPhysical() {
        return addressPhysical;
    }

    /**
     * @param addressPhysical the addressPhysical to set
     */
    public void setAddressPhysical(String addressPhysical) {
        this.addressPhysical = addressPhysical;
    }

    /**
     * @return the addressPostal
     */
    public String getAddressPostal() {
        return addressPostal;
    }

    /**
     * @param addressPostal the addressPostal to set
     */
    public void setAddressPostal(String addressPostal) {
        this.addressPostal = addressPostal;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
