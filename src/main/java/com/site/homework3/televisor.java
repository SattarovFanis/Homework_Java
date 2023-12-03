package com.site.homework3;

public class televisor {
    private String name;
    public int size;
    private String channels;

    public televisor() {

    }

    public String showSomething(String matchtv) {
        return "televisor " + this.name + " show " + matchtv;
    }



    public televisor(String name, int size, String channels) {
        this.name = name;
        this.size = size;
        this.channels = channels;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }


    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String toString() {
        return "televisor с данными:\n" + this.name + "-Имя; \n" + this.size + "-Размер; \n" + this.channels + "-Канал; \n";

    }
}
