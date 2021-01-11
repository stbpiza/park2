package com.park.dto;

import com.park.model.InOutType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GateDto {
    private InOutType in_out;
}
