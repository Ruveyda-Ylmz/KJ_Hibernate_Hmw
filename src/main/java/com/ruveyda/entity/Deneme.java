package com.ruveyda.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity //varlık sınıfım Deneme olduğunu belirtir
public class Deneme extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id ve name kolonlarım var
    private Long id; //id kolonum IDENTITY(otomatik kendi arka atamasını yapcak)
    private String name;

}
