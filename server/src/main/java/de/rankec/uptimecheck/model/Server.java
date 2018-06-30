package de.rankec.uptimecheck.model;

import lombok.Getter;
import lombok.Setter;

import java.net.URL;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Server {

    private UUID id;

    private String name;

    private URL url;

    private List<HealthRule> healthRules;

}
