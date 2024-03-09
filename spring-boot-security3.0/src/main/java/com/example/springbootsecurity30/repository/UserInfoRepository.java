package com.example.springbootsecurity30.repository;

import com.example.springbootsecurity30.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

    Optional<UserInfo> findByName(String name);
    Optional<UserInfo> findByEmail(String email);

}
