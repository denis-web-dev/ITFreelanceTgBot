package me.telegram.bot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private String id;
    private String name;
    private BigDecimal price;
    private String description;
    private String photo;
}
