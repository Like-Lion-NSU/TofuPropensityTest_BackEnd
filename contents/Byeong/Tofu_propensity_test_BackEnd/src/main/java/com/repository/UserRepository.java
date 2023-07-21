package com.repository;



import com.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User save(User user); // 유저의 정보를 저장

    Optional<User> findById(Long id); // ID로 유저를 검색하는 기능
    User findByUsername(String username); // username으로 검색

}
