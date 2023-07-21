package tofu.tofu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import tofu.tofu.domain.Tofu;
import tofu.tofu.domain.User;
import tofu.tofu.service.TofuService;

@Controller
@RequiredArgsConstructor
public class TofuController {
    private final TofuService tofuService;

    @PostMapping("/")
    public void saveTofuByUser(String mbti, Long Id){
        tofuService.saveTofuByUser(mbti, Id);
    }

    @GetMapping("/result")
    public User findTofu(Long Id){
        User user = tofuService.findUser(Id);
        return user;
    }
}