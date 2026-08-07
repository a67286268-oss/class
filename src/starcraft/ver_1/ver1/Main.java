package starcraft.ver_1.ver1;

public class Main {

    public static void main(String[] args) {

        Zealot zealot1 = new Zealot("피닉스"); // 기본공격력 5
        Zergling zergling1 = new Zergling("디바우링 원"); // 기본공격력 3
        Marin marin1 = new Marin("짐 레이너"); // 기본공격력 4

        zealot1.showInfo();
        zergling1.showInfo();
        marin1.showInfo();

        System.out.println("===========================");

        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        zealot1.attackMarin(marin1);
        marin1.attackZealot(zealot1);
        zergling1.attackMarin(marin1);

        System.out.println("===========================");
        zergling1.showInfo();
        zealot1.showInfo();
        marin1.showInfo();

    }

}
