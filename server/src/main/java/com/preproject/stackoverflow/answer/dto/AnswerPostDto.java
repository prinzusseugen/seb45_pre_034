package com.preproject.stackoverflow.answer.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class AnswerPostDto {
    private Integer questionId;
    private Integer userId;
    @NotBlank(message = "본문이 빈칸이어서는 안됩니다.")
    private String body;
}
