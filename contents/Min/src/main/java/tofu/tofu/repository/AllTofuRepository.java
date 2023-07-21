//package tofu.tofu.repository;
//
//import tofu.tofu.domain.AllTofu;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface AllTofuRepository extends JpaRepository<AllTofu, Long>{
//        AllTofu findByName(String name);
//
//        List<AllTofu> findByDistributionValueGreaterThan(double minValue);
//        // 주어진 최소 값보다 큰 분포도 값을 가짐
//        List<AllTofu> findByDistributionValueLessThan(double maxValue);
//        // 주어진 최대 값보다 작은 분포도 값을 가짐
//}
//
//
