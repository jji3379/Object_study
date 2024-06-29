package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
