package com.secao23.projetoSecao23.repositories;

import com.secao23.projetoSecao23.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
