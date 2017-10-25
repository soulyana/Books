package me.soulyana;

import java.util.ArrayList;

public class Chapters {
    private String title;
    private ArrayList<Pages> pages;

    public Chapters() {
        pages = new ArrayList<Pages>();
    }

    public Chapters(String title) {
        this.title = title;
        pages = new ArrayList<Pages>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Pages> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Pages> pages) {
        this.pages = pages;
    }

    public void addPages(Pages aPage) {
        pages.add(aPage);
    }
}


