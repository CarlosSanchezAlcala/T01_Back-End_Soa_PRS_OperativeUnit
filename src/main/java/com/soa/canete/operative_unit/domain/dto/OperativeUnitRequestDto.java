package com.soa.canete.operative_unit.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class OperativeUnitRequestDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 8222253670338491507L;

    @Column
    private String name;
    @Column("id_funcionary")
    private Integer id_funcionary;
    @Column
    private String phonenumber;
    @Column
    private String address;
    @Column("codubi")
    private String codubi;
    @Column
    private String status;

}
