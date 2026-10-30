package com.educandoweb.projetowebservice.repositories;

import com.educandoweb.projetowebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
