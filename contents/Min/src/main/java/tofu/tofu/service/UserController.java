package tofu.tofu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tofu.tofu.Dto.UserDto;
import tofu.tofu.domain.User;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test") //post로 요청을 보냄 ->DTO
    public User saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto.getUserName());
    }
}
