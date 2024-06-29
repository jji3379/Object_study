package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public class AmountDiscountPolicy implements DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
