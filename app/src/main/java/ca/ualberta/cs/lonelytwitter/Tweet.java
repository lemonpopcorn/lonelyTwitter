package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yuqiao on 9/19/18.
 */

public abstract class Tweet {

    protected String message;
    protected Date date;
    private ArrayList<AbstractMood> moods = new ArrayList<AbstractMood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public void setMessage(String message) throws TooLongTweetException{
        if (message.length() > 140){
            throw new TooLongTweetException();
        }
        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public abstract Boolean isImportant();

    public <T extends AbstractMood> void addMood(T mood){
        moods.add(mood);
    }

    public ArrayList<AbstractMood> getMoods() {
        return (ArrayList<AbstractMood>) moods.clone();
    }
}
