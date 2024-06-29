package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public class PercentDiscountPolicy implements DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent) {
        this.percent = percent;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
