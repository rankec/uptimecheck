package de.rankec.uptimecheck.repository;

import de.rankec.uptimecheck.model.Server;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ServerRepository extends CrudRepository<Server, UUID> {
}
