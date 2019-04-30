package com.mypetpeers.mypetpeers.repository;

import org.springframework.stereotype.Repository;

import com.mypetpeers.mypetpeers.model.User;

@Repository
public class UserRepository extends JpaRepository<User,Integer>{


}
