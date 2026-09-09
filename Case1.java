/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter guest name: ");
        String guestName = scanner.nextLine();

        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        System.out.print("Enter room rate: ");
        double roomRate = scanner.nextDouble();
        System.out.println("Guest: " + guestName + "; Room: " + roomNumber +
                           "; Nights: " + nights + "; Room Rate: PHP " + roomRate);

        scanner.close();
    }
}