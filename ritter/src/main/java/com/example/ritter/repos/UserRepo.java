package com.example.ritter.repos;

import com.example.ritter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);

	User findByActivationCode(String code);
}
