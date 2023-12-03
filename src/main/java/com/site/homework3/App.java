package com.site.homework3;

public class App {
    public static void main(String[] args) {
        televisor LG = new televisor();
        LG.setName("LG");
        LG.getName();
        LG.setChannels("russian1");
        LG.getChannels();
        LG.size = 24;
        televisor samsung = new televisor("Samsung", 32, "kultura");
        System.out.println(samsung);
        System.out.println();
        System.out.println(LG);
        System.out.println();
        String newmatchtv = " basketball ";
        System.out.println(LG.showSomething(newmatchtv));
    }
}
