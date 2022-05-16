package com.propify.challenge.service;

import com.propify.challenge.entity.Property;

import java.util.Collection;

public interface PropertyService {
    public Collection<Property> search(String minRentPrice, String maxRentPrice);

    public Property findById(int id);

    public void insert(Property property);

    public void update(Property property);

    public void delete(int id);
}
