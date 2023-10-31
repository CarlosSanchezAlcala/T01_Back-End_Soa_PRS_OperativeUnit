package com.soa.canete.operative_unit.service.impl;

import com.soa.canete.operative_unit.domain.dto.OperativeUnitResponseDto;
import com.soa.canete.operative_unit.domain.mapper.OperativeUnitMapper;
import com.soa.canete.operative_unit.domain.model.OperativeUnit;
import com.soa.canete.operative_unit.repository.OperativeUnitRepository;
import com.soa.canete.operative_unit.service.OperativeUnitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Comparator;

@Service
@Slf4j
@RequiredArgsConstructor
public class OperativeUnitImpl implements OperativeUnitService {

    final OperativeUnitRepository operativeRepository;

    @Override
    public Flux<OperativeUnitResponseDto> findAllDataOperativeUnit() {
        return this.operativeRepository.findAll()
                .sort(Comparator.comparing(OperativeUnit::getId_operativeunit).reversed())
                .map(OperativeUnitMapper::toDto);
    }
}