package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.condition.DiscountCondition;
import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
