package com.lecture.carrental.repository;


import com.lecture.carrental.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository   // anatosyanla bunun @Repository oldugunu belirtmeliyiz
@Transactional // bir hata yaptigimizda geri almamizi saglar.
public interface UserRepository extends JpaRepository<User, Long> {

                                                                         // @Query("SELECT u From User u Where u.email =?1")
                                                                           //     1demek 1. paremetreye bakiyor --> bunu defaul olusturuyor gerek yok
    Optional<User>findByEmail(String email);
}
