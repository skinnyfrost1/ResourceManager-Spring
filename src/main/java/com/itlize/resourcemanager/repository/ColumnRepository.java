package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Columns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="columns")
public interface ColumnRepository extends JpaRepository<Columns, Integer> {
}
