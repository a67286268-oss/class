//package io.ch5;
//
//import java.io.*;
//
//public class KeyboardConsoleStream {
//
//    public static void main(String[] args) {
//
//        // 표준 스트림 -- 3개 InputStream  --> (System.in)        // 표준 스트림 + InputStreamReadertry(InputStreamReader reader= newInputStreamReader(System.in)) {
//        // System.out.println(); -->PrintWriter writer= newPrintWriter(System.out, true);
//        System.out.println("텍트스를 입력하세요 ");
//        int charCode;
//        // Ctrl + D 로 while 종료 처리 가능while( (charCode= reader.read()) != -1) {
//        writer.print((char) charCode);
//    }
//    writer.flush(); // 강제로 버퍼에 남은 데이터를 즉시 출력} catch(IOException e) {
//
//} // end of main} // end of class