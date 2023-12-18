package com.soa.canete.operative_unit.web;

import com.soa.canete.operative_unit.domain.dto.OperativeUnitResponseDto;
import com.soa.canete.operative_unit.repository.OperativeUnitRepository;
import com.soa.canete.operative_unit.service.OperativeUnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/operativeUnit")
@RequiredArgsConstructor
public class OperativeUnitController {

    final OperativeUnitRepository operativeUnitRepository;
    final OperativeUnitService operativeUnitService;

    @GetMapping("/listData")
    public Flux<OperativeUnitResponseDto> getDataCompleteOperativeUnit() {
        return this.operativeUnitService.findAllDataOperativeUnit();
    }

}
