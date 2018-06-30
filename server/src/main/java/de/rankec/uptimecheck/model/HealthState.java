package de.rankec.uptimecheck.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class HealthState {

    private UUID id;

    private UUID serverId;

    private long responseTime;

    private String responseBody;

    private Long responseCode;

    private Date requestDate;

    private ResponseState state;

}
