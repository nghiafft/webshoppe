package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findOneByUserNameAndStatus(String name, int status);
    public UserEntity findById(long id);
}
