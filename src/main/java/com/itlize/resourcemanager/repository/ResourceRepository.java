package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {
}
