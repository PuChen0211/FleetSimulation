package com.pu.spring.uber.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embeddable;

/**
 * Created by puchen on 12/6/16.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
@RequiredArgsConstructor
public class UnitFault {
    private final String vin;
    private Long spn;
    private Long fmi;

    @SuppressWarnings("unused")
    private UnitFault() {
        this.vin = "";
    }
}
