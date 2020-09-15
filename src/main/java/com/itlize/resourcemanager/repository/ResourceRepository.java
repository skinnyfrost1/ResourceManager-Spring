package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="resourceRepository")

public interface ResourceRepository extends JpaRepository<Resource, Integer> {

}
