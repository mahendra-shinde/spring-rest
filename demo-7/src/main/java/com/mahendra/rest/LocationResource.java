package com.mahendra.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mahendra.models.Location;

@RepositoryRestResource(path = "locations")
public interface LocationResource extends CrudRepository<Location, Integer>{

}
