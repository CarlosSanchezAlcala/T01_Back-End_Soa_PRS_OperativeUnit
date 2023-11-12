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
    @Column
    private Integer id_funcionary;
    @Column("phonenumber")
    private String phoneNumber;
    @Column
    private String address;
    @Column
    private String status;

    public OperativeUnit(String name, Integer id_funcionary, String phoneNumber, String address, String status) {
        this.name = name;
        this.id_funcionary = id_funcionary;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.status = status;
    }

}
