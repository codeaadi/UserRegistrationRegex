package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User need to follow pre-defined Mobile Format
 */

public class EnterMobileNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile no. : ");
        String phNum = scanner.nextLine();
        System.out.println(Pattern.matches("[6-9]{1}[0-9]{1}[\\s][0-9]{10}", phNum));
    }
}