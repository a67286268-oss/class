package starcraft.ver_1.ver1;

public class Zergling {
    String name;
    int power;
    int hp;

    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // 공격을 받았을 때
    public void beAttacked(int power) {
        if (this.hp <= 0) {
            System.out.println("대상이 없습니다");
            return;
        }

        this.hp -= power;
        System.out.println(this.name + "이(가) " + power + "의 데미지를 입었습니다.");

        if (this.hp <= 0) {
            this.hp = 0;
            System.out.println(this.name + "이(가) 전사했습니다.");
        }
    }

    // 질럿 공격
    public void attackZealot(Zealot zealot) {
        System.out.println(this.name + "이(가) 질럿을 공격합니다.");
        zealot.beAttacked(this.power);
    }

    // 마린 공격
    public void attackMarin(Marin marin) {
        System.out.println(this.name + "이(가) 마린을 공격합니다.");
        marin.beAttacked(this.power);
    }

    public void showInfo() {
        System.out.println("=====상태창=====");
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + hp);
        System.out.println("공격력 : " + power);
    }
}
