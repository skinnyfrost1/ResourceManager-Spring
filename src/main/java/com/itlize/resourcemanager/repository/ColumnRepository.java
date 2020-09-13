package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Columns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ColumnRepository extends JpaRepository<Columns, Integer> {
}
