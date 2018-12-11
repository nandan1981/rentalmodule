package com.rentaladda.model;

import java.util.Date;

public class Gadget {

    private int GadgetId;
    private String GadgetName;
    private String Description;
    private Date manufacturedDate;
    private Long rentalDuration;
    private Long rentalRate;
    private Enum Rating;
    private Long replacementCost;
    private String gadgetCategory;


    public int getGadgetId() {
        return GadgetId;
    }

    public void setGadgetId(int gadgetId) {
        GadgetId = gadgetId;
    }

    public String getGadgetName() {
        return GadgetName;
    }

    public void setGadgetName(String gadgetName) {
        GadgetName = gadgetName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Long getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Long rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Long getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Long rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Enum getRating() {
        return Rating;
    }

    public void setRating(Enum rating) {
        Rating = rating;
    }

    public Long getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(Long replacementCost) {
        this.replacementCost = replacementCost;
    }

}
