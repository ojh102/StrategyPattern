package com.ojh.www.strategypatternstudy.duck;

import com.ojh.www.strategypatternstudy.fly.FlyWithWings;
import com.ojh.www.strategypatternstudy.quack.Quack;
import com.ojh.www.strategypatternstudy.quack.Squeak;

/**
 * Created by JaeHwan Oh on 2016-05-18.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "저는 물오리입니다.";
    }
}
