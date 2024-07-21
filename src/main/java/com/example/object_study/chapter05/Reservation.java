package com.example.object_study.chapter05;

import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter04.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money money;
    private int audienceCount;
}
