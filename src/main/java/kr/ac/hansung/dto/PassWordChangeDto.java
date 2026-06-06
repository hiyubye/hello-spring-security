package kr.ac.hansung.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PassWordChangeDto {

    @NotBlank(message = "현재 비밀번호 입력")
    private String currentPassword;
    @NotBlank
    @Size(min = 4, message = "비밀번호는 최소 4자이상")
    private String newPassword;
    @NotBlank(message = "변경할 비밀번호 다시 입력")
    private String confirmPassword;
}
