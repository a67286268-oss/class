package com.oop10;

public class StaticRuleTest {

    private String version = "1.0.0"; // 인스턴스 변수
    private static String appName = "로또 번호 생성기"; // static 변수

    // 인스턴스 메소드
    public String getVersion() {
        System.out.println(appName);
        System.out.println(version);
        return version;
    }

    // static 메소드
    public static String makeMessage() {
        System.out.println(appName); // appName => static 변수

        /*System.out.println(version);// version => 인스턴스 변수 // 불가능
        System.out.println(getVersion()); // 불가능
        System.out.println(this);*/ // 불가능

        return appName + "입니다";
    }

}
