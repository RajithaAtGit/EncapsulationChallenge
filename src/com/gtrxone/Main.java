package com.gtrxone;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        System.out.println("Pages printed was " + printer.printPages(4) + " new total print count for printer = " + printer.getPagesPrinted());
        System.out.println("Pages printed was " + printer.printPages(2) + " new total print count for printer = " + printer.getPagesPrinted());
        System.out.println("Pages printed was " + printer.printPages(3) + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
