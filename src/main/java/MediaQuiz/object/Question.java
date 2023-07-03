package MediaQuiz.object;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String question;

    @JsonIgnore
    @Column(nullable = false)
    private String answer;

    @Column(nullable = false)
    private Integer difficulty;

    @ManyToOne
    @JoinColumn
    private Category category;
}
