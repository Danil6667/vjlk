package com.example.dz3_3;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FootballClubRepository {

    private final List<FootballClubModel> listOfClubs = new ArrayList<>();

    public List<FootballClubModel> getListOfClubs() {
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-11.jpg", "Реал Мадрид", 25, "#FFFFFF"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-10.jpg", "Барселона ", 23, "#FF2A6BCF"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-3.jpg", "Манчестер Юнайтед ", 36, "#FFF44336"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-9.jpg", "Ювентус ", 28, "#FF66675E"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-4.jpg", "Челси ", 21, "#FF3F51B5"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-8.jpg", "Ливерпуль ", 32, "#FFEA7575"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-5.jpg", "Париж Сен-Жермен ", 25, "#FF3DA4DC"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-7.jpg", "Бавария ", 15, "#FFC85951"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-2.jpg", "Арсенал ", 14, "#FFFA4A4A"));
        listOfClubs.add(new FootballClubModel("https://footballstyle.com.ua/images/_qload/top-clubs-6.jpg", "Манчестер Сити", 27, "#FF4AF4FA"));
        return listOfClubs;
    }
}
