package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
