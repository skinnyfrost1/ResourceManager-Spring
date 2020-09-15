package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="projectRepository")

public interface ProjectRepository extends JpaRepository<Projects, Integer> {
}
