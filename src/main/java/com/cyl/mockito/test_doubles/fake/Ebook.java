package com.cyl.mockito.test_doubles.fake;

public class Ebook extends Book{
    private String eTitle;

    public Ebook(String eTitle) {
        this.eTitle = eTitle;
    }

    public String geteTitle() {
        return eTitle;
    }

    public void seteTitle(String eTitle) {
        this.eTitle = eTitle;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "eTitle='" + eTitle + '\'' +
                '}';
    }
}
