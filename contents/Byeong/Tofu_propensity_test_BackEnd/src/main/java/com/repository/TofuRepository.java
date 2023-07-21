package com.repository;



import com.domain.Tofu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TofuRepository extends JpaRepository<Tofu,Long> {
    Tofu save(Tofu tofu); // 저장

    Optional<Tofu> findById(Long id); // 두부의 id로 두부 검색

    List<Tofu> findAll(); // 전체조호

    List<Tofu> findByType(String type); // 타입으로 조회

    List<Tofu> findByGoodType(); // 좋은 상성의 두부

    List<Tofu> findByBadType(); // 나븐 상성의 두부



}
