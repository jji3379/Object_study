package com.example.object_study.chapter02.condition;

import com.example.object_study.chapter02.Screening;
import com.example.object_study.chapter02.condition.DiscountCondition;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
