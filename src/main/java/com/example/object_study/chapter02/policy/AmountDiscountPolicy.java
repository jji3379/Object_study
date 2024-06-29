package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.condition.DiscountCondition;
import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
