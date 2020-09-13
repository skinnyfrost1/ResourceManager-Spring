package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Project_to_Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProjectToResourceRepository extends JpaRepository<Project_to_Resource, Integer> {
}
