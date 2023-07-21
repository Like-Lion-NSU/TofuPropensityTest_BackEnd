package tofu.tofu.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import tofu.tofu.domain.Tofu;
import tofu.tofu.domain.User;
import tofu.tofu.repository.TofuRepository;
import tofu.tofu.repository.UserRepository;


@Service
@RequiredArgsConstructor
public class TofuService {
    private final TofuRepository tofuRepository;
    private final UserRepository userRepository;
    public void saveTofuByUser(String mbti, Long Id){
        Tofu tofu=tofuRepository.findByMbti(mbti);
        User user=userRepository.findById(Id).orElse(null);
        user.setTofu(tofu);
    }
    public User findUser (Long Id){
        User user=userRepository.findById(Id).orElse(null);
        return user;
    }
}
