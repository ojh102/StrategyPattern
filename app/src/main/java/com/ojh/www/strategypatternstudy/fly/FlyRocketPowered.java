package com.ojh.www.strategypatternstudy.fly;

/**
 * Created by JaeHwan Oh on 2016-05-18.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public String fly() {
        return "로켓 추진으로 날아갑니다!!!";
    }
}
