package com.propify.challenge.service.impl;

import com.propify.challenge.entity.Property;
import com.propify.challenge.repository.PropertyRepository;
import com.propify.challenge.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PropertyServiceImpl implements PropertyService {

    private PropertyRepository repository;

    @Autowired
    public PropertyServiceImpl(PropertyRepository repository) {
        this.repository = repository;
    }

    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        //TODO: implents this method
        return null;
    }

    public Property findById(int id) {
        //TODO: define exception classes
        return this.repository.findById(id).orElseThrow();
    }

    public void insert(Property property) {
        //TODO: implents this method
    }

    public void update(Property property) {
        //TODO: implents this method
    }

    public void delete(int id) {
        //TODO: implents this method
    }

    //TODO: ask for this method
    /*
    public PropertyReport propertyReport() {
        var allProperties = propertyMapper.search(null, null);
        var propertyReport = new PropertyReport();

        // Calculate total quantity
        // propertyReport.totalQuantity =

        // Calculate the quantity of each type, 0 if there is no properties.
        // propertyReport.quantityPerType =

        // Calculate the average rent price (exclude the properties without rent price or with rent price = 0)
        // propertyReport.averageRentPrice =

        // Calculate the quantity of properties in the state of Illinois (IL)
        // propertyReport.illinoisQuantity =

        return propertyReport;
    }*/
}
