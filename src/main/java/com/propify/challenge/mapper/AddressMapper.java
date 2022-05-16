package com.propify.challenge.mapper;

import com.propify.challenge.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Mapper
public interface AddressMapper {

    public void insert(Address address);

    public Set<Address> search();

    public Address findById(Integer id);

}
