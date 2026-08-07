package com.oop10;

import java.util.Random;

public class LottoNumberMaker {

    // static변수 활용
    // 난수 생성기 하나 만들어서 계속 재사용
    private static Random random = new Random();
    public static int makeNumber() {
        return random.nextInt(45) + 1;
    }

}
