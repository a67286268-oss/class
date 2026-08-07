package starcraft.ver_1.ver5;

public class Game {

    public static void main(String[] args) {
        // 테스트 코드 작성

        Unit[] units = new Unit[3];
        units[0] = new Zealot("질럿1");
        units[1] = new Marine("마린1");

        units[0].attackUnit(units[1]);

    } // end of main
} // end of class
