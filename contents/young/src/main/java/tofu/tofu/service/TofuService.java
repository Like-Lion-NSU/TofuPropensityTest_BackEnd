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


    public void saveTofuByUser(Long tofuId, Long id){
        Tofu tofu=tofuRepository.findById(tofuId).orElse(null);
        User user=userRepository.findById(id).orElse(null);
        user.setTofu(tofu);
    }

    public User findUser (Long id){
        User user=userRepository.findById(id).orElse(null);
        return user;
    }
}
