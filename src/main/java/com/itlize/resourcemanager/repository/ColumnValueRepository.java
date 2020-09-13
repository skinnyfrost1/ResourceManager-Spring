package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.ColumnValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="columnValueRepository")

public interface ColumnValueRepository extends JpaRepository<ColumnValue, Integer> {
}
