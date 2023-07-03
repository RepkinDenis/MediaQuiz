package MediaQuiz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Builder
public class CheckAnswerDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long questionId;
    private Boolean isCorrect;
    private String correctAnswer;
}
