package com.example.object_study.chapter04;

import com.example.object_study.chapter02.Money;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money money;
    private int audienceCount;
}
