package de.rankec.uptimecheck.repository;

import de.rankec.uptimecheck.model.HealthState;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HealthStateRepository extends CrudRepository<HealthState, UUID> {
}
