package starcraft.ver_1.ver1;

public class Zealot {
    String name;
    int power;
    int hp;

    public Zealot(String name) {
        this.name = name;
        this.power = 5;
        this.hp = 80;
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
        if(this.hp <= 0) {
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

    //  저글링 공격
    public void attackZergling(Zergling zergling) {
        System.out.println(this.name + "이(가) 질럿을 공격합니다.");
        zergling.beAttacked(this.power);
    }

    // 마린 공격
    public void attackMarin(Marin marin) {
        System.out.println(this.name + "이(가) 마린을 공격합니다.");
        marin.beAttacked(this.power);
    }
    // 4. 현재 상태 출력
    public void showInfo() {
        System.out.println("=====상태창=====");
        System.out.println("이름 : " + name);
        System.out.println("체력 : " + hp);
        System.out.println("공격력 : " + power);
    }

}
