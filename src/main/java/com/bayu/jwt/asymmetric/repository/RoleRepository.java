package com.bayu.jwt.asymmetric.repository;

import com.bayu.jwt.asymmetric.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findFirstByAuthority(String authority);
}
