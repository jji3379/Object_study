package com.example.object_study.chapter02.policy;

import com.example.object_study.chapter02.Money;
import com.example.object_study.chapter02.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
