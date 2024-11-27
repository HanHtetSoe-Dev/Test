package com.jdc.balalce.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.jdc.balance.model.domain.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	UserDetails findOne(String username);

	Optional<User> findOneByLoginId(String username);

}
