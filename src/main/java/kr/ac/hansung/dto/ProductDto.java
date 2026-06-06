package kr.ac.hansung.dto;

import jakarta.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    @NotBlank(message = "상품명은 필수")
    private String name;
    @Min(value = 0, message = "가격은 0원 이상")
    private int price;
    private String description;
    @Min(value = 0, message = "재고는 0개 이상")
    private int stock;
}
