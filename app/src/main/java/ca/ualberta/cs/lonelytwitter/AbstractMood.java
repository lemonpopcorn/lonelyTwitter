package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class AbstractMood {

    private Date date;

    public AbstractMood(){
        this.date = new Date();
    }

    public AbstractMood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public abstract String toString();

}
