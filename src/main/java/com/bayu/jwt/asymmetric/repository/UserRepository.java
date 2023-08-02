package com.bayu.jwt.asymmetric.repository;

import com.bayu.jwt.asymmetric.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findFirstByUsername(String username);

}
