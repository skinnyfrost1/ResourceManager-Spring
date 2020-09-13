package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.ColumnValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ColumnValueRepository extends JpaRepository<ColumnValue, Integer> {
}
