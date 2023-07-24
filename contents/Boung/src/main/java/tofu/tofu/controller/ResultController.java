package tofu.tofu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tofu.tofu.Dto.QuestionnaireDTO;
import tofu.tofu.domain.User;
import tofu.tofu.service.TestService;

@RestController
@RequestMapping("/results")
public class ResultController {

    private final TestService testService;

    public ResultController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveUserData(@RequestBody QuestionnaireDTO questionnaire) {
        User savedUser = testService.saveUserWithTofu(questionnaire.getUsername(), questionnaire.getTofuMbti());

        if (savedUser != null) {
            return ResponseEntity.ok("데이터 저장 성공");
        } else {
            return ResponseEntity.badRequest().body("데이터 저장 실패");
        }
    }
}
