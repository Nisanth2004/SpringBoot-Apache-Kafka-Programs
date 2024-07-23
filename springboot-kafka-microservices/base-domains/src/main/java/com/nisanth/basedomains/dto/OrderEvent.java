package com.nisanth.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderEvent {
    // this class is used to transfer the data between producer and consumer
    private String message;
    private String status;
    private Order order;
}
