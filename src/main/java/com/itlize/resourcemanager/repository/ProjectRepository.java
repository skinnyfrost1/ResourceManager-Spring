package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Projects;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Projects, Integer> {
}
