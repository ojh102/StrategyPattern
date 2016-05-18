package com.ojh.www.strategypatternstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ojh.www.strategypatternstudy.duck.Duck;
import com.ojh.www.strategypatternstudy.duck.MallardDuck;
import com.ojh.www.strategypatternstudy.duck.ModelDuck;
import com.ojh.www.strategypatternstudy.fly.FlyNoWay;
import com.ojh.www.strategypatternstudy.fly.FlyRocketPowered;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    Duck duck;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tvResult);

        button = (Button) findViewById(R.id.btnMallardDuck);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                duck = new MallardDuck();
                String msg = duck.display() + "\n" + duck.performFly() + "\n" + duck.performQuack() + "\n" + duck.swim();
                textView.setText(msg);
            }
        });

        button = (Button) findViewById(R.id.btnModelDuck);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                duck = new ModelDuck();

                if (count % 2 == 0) {
                    duck.setFlyBehavior(new FlyNoWay());
                } else {
                    duck.setFlyBehavior(new FlyRocketPowered());
                }

                String msg = duck.display() + "\n" + duck.performFly() + "\n" + duck.performQuack() + "\n" + duck.swim();
                textView.setText(msg);
                count++;
            }
        });
    }
}
