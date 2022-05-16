package com.propify.challenge.mapper;

import com.propify.challenge.entity.Property;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Mapper
public interface PropertyMapper {

    public void insert(Property property);

    public Set<Property> search(String minRentPrice, String maxRentPrice);

    public Property findById(Integer id);

    public void update(Property property);

    public void delete(Integer id);
}
