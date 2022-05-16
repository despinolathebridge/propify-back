package com.propify.challenge.controller;

import com.propify.challenge.Property;
import com.propify.challenge.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/v1/properties")
public class PropertyController {

    private PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService){
        this.propertyService = propertyService;
    }


    @GetMapping
    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyService.search(minRentPrice, maxRentPrice);
    }

    @GetMapping("/{id}")
    public Property findById(@PathVariable(value = "id") int id) {
        return propertyService.findById(id);
    }

    @PostMapping
    public void insert(Property property) {
        // TODO: Property attributes must be validated
        propertyService.insert(property);
    }

    @PutMapping
    public void update(Property property) {
        // TODO: Property attributes must be validated
        propertyService.update(property);
    }

    @DeleteMapping
    public void delete(int id) {
        propertyService.delete(id);
    }

    //TODO what is this?
    /*public PropertyReport report() {
        return propertyService.propertyReport();
    }*/
}
