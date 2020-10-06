package com.itlize.resourcemanager.repository;

import com.itlize.resourcemanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//@RepositoryRestResource(path="userRepository")

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);

}
