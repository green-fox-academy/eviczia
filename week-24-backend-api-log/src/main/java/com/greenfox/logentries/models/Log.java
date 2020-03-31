package com.greenfox.logentries.models;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Log {

    private LocalDateTime createdAt;
    private String endpoint;
    private String data;


}
