package MediaQuiz.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Builder
public class CreateQuestionDto {
    private Long count;
    private Long minDif;
    private Long maxDif;
    private List<Long> category;
}
