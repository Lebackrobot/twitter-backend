package com.build.twitter_backend.repositories;

import com.build.twitter_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
     UserDetails findByUsername(String username);
}
