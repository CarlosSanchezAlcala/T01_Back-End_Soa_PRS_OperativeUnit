package com.soa.canete.operative_unit.domain.mapper;

import com.soa.canete.operative_unit.domain.dto.OperativeUnitRequestDto;
import com.soa.canete.operative_unit.domain.dto.OperativeUnitResponseDto;
import com.soa.canete.operative_unit.domain.model.OperativeUnit;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OperativeUnitMapper {

    public static OperativeUnit toModel(OperativeUnitRequestDto dto) {
        return new OperativeUnit(
                dto.getName(),
                dto.getId_funcionary(),
                dto.getPhoneNumber(),
                dto.getAddress(),
                dto.getCodubi(),
                dto.getStatus()
        );
    }

    public static OperativeUnit toModel(OperativeUnitRequestDto dto, Integer id_operativeunit) {
        return new OperativeUnit(
                id_operativeunit,
                dto.getName(),
                dto.getId_funcionary(),
                dto.getPhoneNumber(),
                dto.getAddress(),
                dto.getCodubi(),
                dto.getStatus()
        );
    }

    public static OperativeUnitResponseDto toDto(OperativeUnit model) {
        return new OperativeUnitResponseDto(
                model.getId_operativeunit(),
                model.getName(),
                model.getId_funcionary(),
                model.getPhoneNumber(),
                model.getAddress(),
                model.getCodubi(),
                model.getStatus()
        );
    }

}
