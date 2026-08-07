package starcraft.ver_1.ver5;

public class Unit implements Attackable {

    protected String name;
    protected int hp;
    protected int power;

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getPower() {
        return this.power;
    }

    public void showInfo() {
        System.out.println("★----------상태창--------------★");
        System.out.println("유닛 이름 : " + name + " | 공격력 : " + power + " | 체력 : " + hp);
    }

    @Override
    public void attackUnit(Unit unit) {
        if (this.hp <= 0) {
            System.out.println(name + "이(가) 사망하여 공격할 수 없습니다");
            return;
        }
        System.out.println(name + "이(가)" + unit.getName() + "을 공격 합니다.");
        unit.beAttackUnit(this.power);
    }

    @Override
    public void beAttackUnit(int power) {
        if (this.hp <= MIN_HP) {
            System.out.println(name + "이(가) 사망하여 공격할 수 없습니다");
            return;
        }
        this.hp -= power;
        if (this.hp < MIN_HP) {
            this.hp = MIN_HP;
        }
        System.out.println(name + "이(가) 공격을 당합니다. (남은 HP : " + this.hp + ")");
    }
}

