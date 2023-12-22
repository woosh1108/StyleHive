package com.codebee.stylehive.jpa.repository;

import com.codebee.stylehive.jpa.entity.UserCouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCouponRepo extends JpaRepository<UserCouponEntity, String> {

}