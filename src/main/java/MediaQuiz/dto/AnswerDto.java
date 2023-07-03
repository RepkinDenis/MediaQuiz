package MediaQuiz.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {
    private Long questionId;
    private String answer;
}
