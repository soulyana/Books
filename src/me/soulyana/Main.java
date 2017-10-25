package me.soulyana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length1, length2;
        String ans = "";

        Book book = new Book();
        Chapters chapters;
        String cTitle, pTitle;
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
            cTitle = scan.nextLine();
            chapters.setTitle(cTitle);
            book.addChapter(chapters);

            System.out.println();
            System.out.println("~~~You can enter multiple pages~~~");
            do {
                pages = new Pages();

                System.out.println("What is this page about?");
                pTitle = scan.nextLine();
                pages.setTitle(pTitle);
                chapters.addPages(pages);

                do {
                    System.out.println("Would you like to add another page? (Y)es or (N)o");
                    ans = scan.nextLine();
                } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

            } while (ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

            do {
                System.out.println("Would you like to add another chapter?");
                ans = scan.nextLine();
            } while(!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

        } while(ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

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