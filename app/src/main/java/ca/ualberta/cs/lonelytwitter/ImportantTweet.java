package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yuqiao on 9/19/18.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
