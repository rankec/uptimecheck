package de.rankec.uptimecheck.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class HealthRule {

    private UUID id;

    private String name;

    private Long responseCode;

    private Long checkTime;

    private boolean active;

    private String url;

}
