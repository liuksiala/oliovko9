package com.example.notesapp;

import java.util.Calendar;

public class Note {
    private static int noteCounter = 0;

    private int Id;
    private String title;
    private String content;
    private String timeAndDate;

    //rakentaja
    public Note(String title, String content){
        noteCounter ++;
        this.Id = noteCounter;
        this.title = title;
        this.content = content;
        this.timeAndDate = getCurrentTimeAndDate();
    }

    // luo aikaleima
    private String getCurrentTimeAndDate(){
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        return String.format("%d:%02d %d.%d.%d", hour, minute, day, month, year);
    }
    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }
}
