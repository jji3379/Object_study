package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
