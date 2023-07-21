package tofu.tofu.domain;


import javax.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;


import java.util.List;


@Entity
@Getter
public class Tofu {

        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id; // 두부를 식별해줄 두부 식별 아이디
        private String mbti;

        private String GoodType; // 한 유형의 두부 와 잘 맞는 유형

        private String BadType; // 한 유형의 두부와 안맞는 유형
        @OneToMany(mappedBy = "tofu", cascade = CascadeType.ALL)
        private List<User> users;

        // 유저 엔티티는 여러개의 두부를 가질 수 있다.
//        @OneToMany(mappedBy = "tofu", cascade = CascadeType.ALL)
//        private List<Tofu> questions; // 해당 두부에 포함된 문항의 목록과 수


    }


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long I'd;
//    private String TofuCategory;
//    private String GoodTypeTofu;
//    private String BadTypeTofu;
//
