package com.motostiburon.facturacion.persistence.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.motostiburon.facturacion.persistence.entities.Address;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address,Integer> {
}