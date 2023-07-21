//package repository;
//
//import domain.User;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.NoResultException;
//import jakarta.persistence.TypedQuery;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
//@Repository
//public class UserRepositoryImpl implements UserRepository {
//    private final EntityManager entityManager;
//
//    public UserRepositoryImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    public Object save(User user){
//        entityManager.persist(user);
//        return null;
//    }
//
//    @Override
//    public Optional<User> findById(Long id) {
//        return entityManager.find(User.class,id);
//    }
//
//    @Override
//    public User findByUsername(String username) {
//        String queryString = "SELECT u FROM User u WHERE u.username = :username";
//        TypedQuery<User> query = entityManager.createQuery(queryString, User.class);
//        query.setParameter("username", username);
//        try {
//            return query.getSingleResult();
//        } catch (NoResultException e) {
//            return null;
//        }
//    }
//}




