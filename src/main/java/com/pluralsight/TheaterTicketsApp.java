package com.pluralsight;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterTicketsApp {

    //!Creating the main method
    public static void main(String[] args) {
        //!Creating a Scanner
        Scanner TheaterTickets = new Scanner(System.in);
        //!Creating a date formatter
        DateTimeFormatter formatter;

        //*Asking questions to fill out form

        //*Asking for their name
        System.out.print("Please enter your name: \n");

        //*storing the name
        String name = TheaterTickets.nextLine();

        //? Splitting the first and last name
        String[] fullName = name.split(" ");

        String firstName = fullName[0];
        String lastName = fullName[1];

        //*Asking date they are coming in
        System.out.print("What date will you be coming (MM/dd/yyyy):  \n");
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //*Storing the date
        String date = TheaterTickets.nextLine();

        //?Formatting the date
        LocalDate dateForTheater = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        //*Asking how many tickets they want
        System.out.print("How many tickets would you like? \n");

        //*Storing the ticket amount
        int numberOfTickets = TheaterTickets.nextInt();

        //?Displaying their tickets, name, and date to come in
        if (numberOfTickets > 1) {
            System.out.printf("%d tickets reserved for %s under %s, %s\n ", numberOfTickets, dateForTheater.format(formatter), lastName, firstName);
        }else {
            System.out.printf("%d ticket reserved for %s under %s, %s\n ", numberOfTickets, dateForTheater.format(formatter), lastName, firstName);
        }






    }
}
