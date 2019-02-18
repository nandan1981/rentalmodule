package com.rentaladda.model;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RentalAddaInformation extends MongoRepository<Information,String> {

}
