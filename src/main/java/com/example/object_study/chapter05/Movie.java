package com.example.object_study.chapter05;

import com.example.object_study.chapter02.Money;
import lombok.Getter;

import java.time.Duration;
import java.util.List;

public abstract class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    List<DiscountCondition> discountConditions;

    public Movie(String title, Duration runningTime, Money fee, List<DiscountCondition> discountConditions) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = discountConditions;
    }

    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    abstract protected Money calculateDiscountAmount();

    protected Money getFee() {
        return fee;
    }
}
