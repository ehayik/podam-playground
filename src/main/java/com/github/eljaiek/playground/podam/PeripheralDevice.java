package com.github.eljaiek.playground.podam;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ToString
@EqualsAndHashCode(of = "uid")
public class PeripheralDevice implements Serializable {

    private int uid;
    private String vendor;
    private LocalDate dateCreated;
    private DeviceStatus status;

}
