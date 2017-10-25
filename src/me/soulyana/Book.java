package me.soulyana;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Chapters> chapters;

    public Book() {
        chapters = new ArrayList<Chapters>();
    }

    public Book(String title) {
        this.title = title;
        chapters = new ArrayList<Chapters>();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Chapters> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapters> chapters) {
        this.chapters = chapters;
    }

    public void addChapter(Chapters aChapter) {
        chapters.add(aChapter);
    }
}
