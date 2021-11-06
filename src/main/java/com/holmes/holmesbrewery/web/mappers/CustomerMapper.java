package com.holmes.holmesbrewery.web.mappers;

import com.holmes.holmesbrewery.domain.Customer;
import com.holmes.holmesbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto dto);
}
