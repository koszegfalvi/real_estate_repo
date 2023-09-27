package hu.progmatic.real_estate_repo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apartment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String ownerName;
    String phoneNumber;
    int sqm;
    Integer price;
    String address;

    public Apartment(Long id, String ownerName, String phoneNumber, int sqm, Integer price, String address) {
        this.id = id;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
        this.sqm = sqm;
        this.price = price;
        this.address = address;
    }
    public Apartment(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSqm() {
        return sqm;
    }

    public void setSqm(int sqm) {
        this.sqm = sqm;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
