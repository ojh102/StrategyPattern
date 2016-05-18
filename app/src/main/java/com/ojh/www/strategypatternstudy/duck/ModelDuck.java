package com.ojh.www.strategypatternstudy.duck;

import com.ojh.www.strategypatternstudy.fly.FlyNoWay;
import com.ojh.www.strategypatternstudy.quack.Quack;
import com.ojh.www.strategypatternstudy.quack.Squeak;

/**
 * Created by JaeHwan Oh on 2016-05-18.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak()
        ;
    }

    @Override
    public String display() {
        return "저는 모형 오리입니다.";
    }
}
