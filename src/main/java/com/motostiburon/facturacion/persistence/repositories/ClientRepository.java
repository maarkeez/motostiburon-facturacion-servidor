package com.motostiburon.facturacion.persistence.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.motostiburon.facturacion.persistence.entities.Client;

@RepositoryRestResource(collectionResourceRel = "client", path = "client")
public interface ClientRepository extends PagingAndSortingRepository<Client,Integer> {
    List<Client> findByName(@Param("name") String name);
}