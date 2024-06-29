package com.example.object_study.chapter02.condition;

import com.example.object_study.chapter02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
