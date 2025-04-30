package com.example.yakoko2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.yakoko2.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
