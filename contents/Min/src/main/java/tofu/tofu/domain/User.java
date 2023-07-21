package tofu.tofu.domain;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;



@Entity
@Data
@NoArgsConstructor//(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id; // 유저Id (PK)

    private String userName; // 사용자의 이름

    @ManyToOne
    @JoinColumn(name="tofu_id")
    private Tofu tofu; // 사용자가 참여한 두부 결과

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private Tofu TofuCate; // 사용자가 참여한 두부 결과의 목록

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private List<Tofu> TofuCate; // 사용자가 참여한 두부 결과의 목록
//
//    private String TofuType; // 사용자의 성격유형 테스트의 결과를 받을 유형 값

}

//@Entity
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long Id; // 유저 아이디
//    private String name; // 유저 이름
//    private Integer EI; // 수치로 받을 것이기 때문에 Integer
//    private Integer SN;
//    private Integer FT;
//    private Integer JP;
//    private String selectMBTI; // 총 결정된 MBTI
//
//}
