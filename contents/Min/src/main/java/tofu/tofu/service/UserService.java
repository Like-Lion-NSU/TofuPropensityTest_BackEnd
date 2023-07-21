package tofu.tofu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tofu.tofu.domain.User;
import tofu.tofu.repository.UserRepository;

import javax.transaction.Transactional;

//User 앤티티 생성하고 받은 값을 저장,
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ei, sn, ft, jp의 값에 따라 저장을 하고 tofuType에 따라 궁합(?)을 적어야함 -> db에 저장하자..!
    @Transactional
    public User saveUser(String username) {
        User user = new User();
        user.setUserName(username);
        return userRepository.save(user);
    }
}
