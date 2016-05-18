package com.ojh.www.strategypatternstudy.duck;

import com.ojh.www.strategypatternstudy.fly.FlyBehavior;
import com.ojh.www.strategypatternstudy.quack.QuackBehavior;

/**
 * Created by JaeHwan Oh on 2016-05-18.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract String display();

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }
    public String swim() {
        return "모든 오리는 물에 뜬다.";
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
