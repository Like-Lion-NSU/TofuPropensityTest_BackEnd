package tofu.tofu.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Dto에 데이터가 UserService로 전달
public class UserDto {
    private String userName;
    private String mbti;

}
