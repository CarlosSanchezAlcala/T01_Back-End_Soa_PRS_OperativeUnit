package com.soa.canete.operative_unit.service;

import com.soa.canete.operative_unit.domain.dto.OperativeUnitResponseDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface OperativeUnitService {

    Flux<OperativeUnitResponseDto> findAllDataOperativeUnit();

}
