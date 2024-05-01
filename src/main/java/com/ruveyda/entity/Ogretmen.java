package com.ruveyda.entity;

import com.ruveyda.utility.enums.EBrans;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tbl_ogertmen")
public class Ogretmen extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Embedded
    private KisiselBilgiler kisisel_Bilgiler;
    private EBrans brands;
    private Long ise_Baslama_Tarihi;

}
