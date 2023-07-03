package MediaQuiz.dto;

import MediaQuiz.object.Category;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Builder
public class QuestionDto {
    private Long id;
    private String question;
    private Long dif;
    private Category category;
}
