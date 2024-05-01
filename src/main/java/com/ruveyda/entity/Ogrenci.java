package com.ruveyda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tbl_ogenci")
public class Ogrenci extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Embedded
    private KisiselBilgiler kisiselBilgiler;
    @Column(name = "dogum_tarihi")
    private Long dogum_Tarihi;
    @Column(name = "sinif_id")
    private Long Sinif_Id;
}
