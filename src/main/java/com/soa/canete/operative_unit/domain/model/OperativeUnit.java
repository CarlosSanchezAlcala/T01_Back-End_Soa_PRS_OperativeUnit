package com.soa.canete.operative_unit.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "operative_unit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperativeUnit {

    @Id
    private Integer id_operativeunit;
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

    public OperativeUnit(String name, Integer id_funcionary, String phonenumber, String address, String codubi, String status) {
        this.name = name;
        this.id_funcionary = id_funcionary;
        this.phonenumber = phonenumber;
        this.address = address;
        this.codubi = codubi;
        this.status = status;
    }

}
