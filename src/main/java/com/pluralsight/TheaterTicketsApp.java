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

        //*Asking date they are coming in
        System.out.print("What date will you be coming (MM/dd/yyyy):  \n");

        //*Storing the date
        String date = TheaterTickets.nextLine();

        //?Formatting the date
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateForTheater = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));

        //*Asking how many tickets they want
        System.out.print("How many tickets would you like? \n");

        //*Storing the ticket amount
        int numberOfTickets = TheaterTickets.nextInt();





    }
}
