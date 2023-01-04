package com.curex;

import com.curex.price.Price;
import com.curex.price.impl.PriceObj;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Solid prensiplerine dikkat edelim PriceObj'si immutable olsun
        Price price = new PriceObj("EURUSD");
        for (int i = 0; i < 1000000; i++) {
            price.push(new Random().nextInt(10000));
        }

        // top() metodunda gelen data büyükten küçeğe doğru en fazla 5 adet olacak  şekilde sıralı gelmeli
        System.out.println(price.name() + " " + price.top());
        System.out.println(price.name() + " " + price.top(3));
        System.out.println(price.name() + " " + price.top(4));
        System.out.println(price.name() + " " + price.top(10));



    }
}