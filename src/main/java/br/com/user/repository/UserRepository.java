package br.com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.user.models.User;

public interface UserRepository extends JpaRepository<User, String>{

}
