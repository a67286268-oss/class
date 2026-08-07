package ch05;

public class Operation5_1 {

    public static void main(String[] args) {

        //게임 캐릭터 상태 설정
        int playerHealth = 50; // 플레이어의 체력
        int playerLevel = 10; // 플레이어의 레벨
        int enemyHealth = 30; // 적의 체력
        int enemyLevel = 15; // 적의 체력

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인하고 출력
        System.out.println("플레이어의 체력이 적군보다 높습니까? : " + (playerHealth > enemyHealth));

        // 2. 플레이어의 체력이 위험 수준인 20이하 인지 확인 후 출력
        System.out.println("플레이어의 체력이 위험수준인 20이하로 내려갔습니까? : " + (playerHealth <= 20));

        // 3. 플레이어와 적의 체력이 같은지 확인 후 출력
        System.out.println("플레이어와 적의 체력이 같습니까? : " + (playerHealth == enemyHealth));

        // 4. 플레이어의 레벨이 30이상인지 확인 후 출력
        System.out.println("플레이어의 레벨이 30을 달성했습니까? : " + (playerLevel >= 30));

        // 주의 사항 : ( > : 초과,미만) , ( >= : 이상,이하)

        // 5. 플레이어의 체력이 30미만인지 확인 후 출력
        System.out.println("플레이어의 체력이 30아래로 내려갔습니까? : " + (playerHealth < 30));

        // 6. 플레이어의 체력이 50초과인지 확인 후 출력
        System.out.println("플레이어의 체력이 50이 넘어갑니까? : " + (playerHealth > 50));


    }

}
