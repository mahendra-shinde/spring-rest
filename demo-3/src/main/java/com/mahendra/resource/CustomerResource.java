package com.mahendra.resource;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.mahendra.models.Customer;

@RepositoryRestResource(path="customer")
public interface CustomerResource extends CrudRepository<Customer, Integer> {
	Optional<Customer> findById(@Param("id") Integer custId);
}
