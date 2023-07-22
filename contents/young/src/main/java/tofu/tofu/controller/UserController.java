/*
package tofu.tofu.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tofu.tofu.Dto.UserDto;
import tofu.tofu.domain.User;
import tofu.tofu.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/test") //post로 요청을 보냄 ->DTO
    public User saveUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto.getUserName());
    }
}
*/
