package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends AbstractMood {

    public HappyMood(){
        super();
    }

    public HappyMood(Date date){
        super(date);
    }

    @Override
    public String toString(){
        return this.getDate().toString() + ": Happy";
    }

}
