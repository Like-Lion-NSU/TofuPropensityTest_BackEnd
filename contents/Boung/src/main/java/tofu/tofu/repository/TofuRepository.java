package tofu.tofu.repository;


import tofu.tofu.domain.Tofu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TofuRepository extends JpaRepository<Tofu, Long> {
    Object findBy();


//    Tofu save(Tofu tofu); // 저장

//    Optional<Tofu> findById(Long id); // 두부의 id로 두부 검색

    //List<Tofu> findall(); // 전체조회

    Tofu findBymbti(String mbti); // 타입으로 조회*/


}
