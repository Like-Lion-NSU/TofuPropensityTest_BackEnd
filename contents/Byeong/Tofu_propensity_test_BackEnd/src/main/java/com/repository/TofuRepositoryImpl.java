//package repository;
//
//import domain.Tofu;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class TofuRepositoryImpl implements TofuRepository {
//    private final EntityManager entityManager;
//
//    public TofuRepositoryImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//
//    @Override
//    public Object save(Tofu tofu) {
//        entityManager.persist(tofu);
//        return null;
//    }
//
//
//    @Override
//    public Optional<Tofu> findById(Long id) {
//        return entityManager.find(Tofu.class, id);
//    }
//
//
//    @Override
//    public List<Tofu> findAll() {
//        String queryString = "SELECT t FROM Tofu t";
//        TypedQuery<Tofu> query = entityManager.createQuery(queryString, Tofu.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Tofu> findByType(String type) { // 특정 유형에 해당하는 두부를 검색
//        String queryString = "SELECT t FROM Tofu t WHERE t.tofuname = :type";
//        TypedQuery<Tofu> query = entityManager.createQuery(queryString, Tofu.class);
//        query.setParameter("type", type);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Tofu> findByGoodType() { // 서로 잘 맞는 유형의 두부 검색
//        String queryString = "SELECT t FROM Tofu t WHERE t.GoodType = 'GoodType'";
//        TypedQuery<Tofu> query = entityManager.createQuery(queryString, Tofu.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Tofu> findByBadType() { // 서로 맞지 않는 유형의 두부 검색
//        String queryString = "SELECT t FROM Tofu t WHERE t.BadType = 'BadType'";
//        TypedQuery<Tofu> query = entityManager.createQuery(queryString, Tofu.class);
//        return query.getResultList();
//    }
//}
