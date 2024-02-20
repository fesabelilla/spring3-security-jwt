package com.example.springbootsecurity30.repository;

import com.example.springbootsecurity30.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
