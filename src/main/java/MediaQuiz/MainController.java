package MediaQuiz;

import MediaQuiz.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

public class MainController {
    protected <T> ResponseEntity<ResponseDto<T>> goodRequest(T body) {
        return ResponseEntity.ok(ResponseDto.goodRequest(body));// возвращает код 200 - успех
    }

    protected  <T> ResponseEntity<ResponseDto<T>> badRequest(String description) {
        return ResponseEntity.badRequest().body(ResponseDto.badRequest(description));// возвращает код 400 - ошибка
    }
}
