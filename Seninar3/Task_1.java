package Seminar3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_1 {
    static boolean flag = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество Дата рождения(dd.mm.yyyy) номер телефона(целое беззнаковое число без форматирования) и пол(символ латиницей f или m)");
        String input = sc.nextLine();
        String[] data = input.split(" ");

        if (data.length != 6) {
            System.err.println("Ошибка! Неверное колличество данных!");
            return;
        }
        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDateStr = data[3];
        String phone = data[4];
        String genderSt = data[5];
        LocalDate birthDate;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(birthDateStr, formatter);
        } catch (Exception e) {
            System.err.println("Ошибка! Неверный формат даты рождения");
            return;
        }
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(phone);
        } catch (NumberFormatException e) {
            System.err.println("Ошибка! Неверный формат номера телефона!");
            return;
        }
        char gender;
        if (genderSt.length() != 1 || (genderSt.charAt(0) == 'f' && genderSt.charAt(0) == 'm')) {
            System.err.println("Ошибка! Неверный формат пола");
            return;
        } else {
            gender = genderSt.charAt(0);
        }
        String fileName = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(lastName + firstName + middleName + birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + phoneNumber + gender + 'n');
            System.out.println("Succes");
            flag = false;
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл!");
            e.printStackTrace();
        }
    }
}



