package me.soulyana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length1, length2;
        String ans = "";

        Book book = new Book();
        Chapters chapters;
        Pages pages;

        System.out.println("Welcome to your book editor!");
        System.out.println();
        System.out.println("Enter the title of your book: ");
        book.setTitle(scan.nextLine());

        System.out.println();
        System.out.println("~~~You can enter multiple chapters~~~");
        do {
            chapters = new Chapters();

            System.out.println("Enter the title of the chapter:");
            chapters.setTitle(scan.nextLine());
            /*System.out.println("How many chapters will this book have?");
            length1 = scan.nextInt();*/

            System.out.println();
            System.out.println("~~~You can enter multiple pages~~~");
            do {
                pages = new Pages();

                System.out.println("What is this page about?");
                pages.setTitle(scan.nextLine());
                /*System.out.println("How many pages will this chapter have?");
                length2 = scan.nextInt();*/

                chapters.addPages(pages);

                System.out.println("Would you like to add another page?");
                ans = scan.nextLine();
            }while(ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

            book.addChapter(chapters);

            System.out.println("Would you like to add another chapter?");
            ans = scan.nextLine();
        }while(ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

        System.out.println();
        System.out.println("Book Title: " + book.getTitle());
        for(Chapters eachChapter : book.getChapters()) {
            System.out.println();
            System.out.println("Chapter: "  + eachChapter.getTitle());
            for (Pages eachPage : eachChapter.getPages()) {
                System.out.println("Page: " + eachPage.getTitle());
            }
        }
    }
}