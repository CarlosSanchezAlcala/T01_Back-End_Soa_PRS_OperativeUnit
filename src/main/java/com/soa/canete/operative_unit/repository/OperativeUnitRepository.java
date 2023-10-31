package com.soa.canete.operative_unit.repository;

import com.soa.canete.operative_unit.domain.model.OperativeUnit;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface OperativeUnitRepository extends ReactiveCrudRepository<OperativeUnit, Integer> {
}
