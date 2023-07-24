package tofu.tofu.service;



import org.springframework.stereotype.Service;
import tofu.tofu.domain.Tofu;
import tofu.tofu.domain.User;
import tofu.tofu.repository.TofuRepository;
import tofu.tofu.repository.UserRepository;

@Service
public class TestService {

    private final UserRepository userRepository;
    private final TofuRepository tofuRepository;

    public TestService(UserRepository userRepository, TofuRepository tofuRepository) {
        this.userRepository = userRepository;
        this.tofuRepository = tofuRepository;
    }

    public User saveUserWithTofu(String username, String tofuMbti) {
        User user = new User();
        user.setUserName(username);

        Tofu tofu = tofuRepository.findBymbti(tofuMbti);
        if (tofu != null) {
            user.setTofu(tofu);
        }
        return userRepository.save(user);
    }
}
