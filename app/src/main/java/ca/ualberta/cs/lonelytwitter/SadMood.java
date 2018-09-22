package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends AbstractMood {

    public SadMood(){
        super();
    }

    public SadMood(Date date){
        super(date);
    }

    @Override
    public String toString(){
        return this.getDate().toString() + ": Sad";
    }

}
