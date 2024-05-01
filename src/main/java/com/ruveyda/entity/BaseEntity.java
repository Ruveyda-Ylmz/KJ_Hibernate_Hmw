package com.ruveyda.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class BaseEntity { //süper class'ım. BaseEntity = üst varlık
    Long createAt;
    Long updateAt;
    Integer state; //durum
    /*-önyüzde kullanıcı hesabı silerse arka planda softdelete düşer.
        arka tarafta softdelete veriler silinmez.(önyüzde gözükmez)
    */

}
