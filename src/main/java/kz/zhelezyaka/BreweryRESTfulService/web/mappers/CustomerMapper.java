package kz.zhelezyaka.BreweryRESTfulService.web.mappers;

import kz.zhelezyaka.BreweryRESTfulService.domain.Customer;
import kz.zhelezyaka.BreweryRESTfulService.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}