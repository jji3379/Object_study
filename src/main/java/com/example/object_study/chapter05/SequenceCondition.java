package com.example.object_study.chapter05;

public class SequenceCondition implements DiscountCondition{
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
