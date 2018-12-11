package com.rentaladda.model;

import java.util.List;

public interface RentalModel {

    public List<Gadget> getListOfGadgets();

    public boolean insertRentalData();

    public boolean updateRentalData();

    public boolean deleteRentalData();


}
