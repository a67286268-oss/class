package com.oop10;

public class LottoGame {

    public static void main(String[] args) {

        int game1 = LottoNumberMaker.makeNumber();
        int game2 = LottoNumberMaker.makeNumber();
        int game3 = LottoNumberMaker.makeNumber();
        int game4 = LottoNumberMaker.makeNumber();
        int game5 = LottoNumberMaker.makeNumber();
        int game6 = LottoNumberMaker.makeNumber();

        System.out.println(game1+" , "+ game2+" , "+ game3+" , "+ game4+" , "+ game5+" , "+ game6);

        // LottoNumberMaker 객체를 만들지 않았는데 실행이된다 이유는 static메소드 이기때문

    }
}
