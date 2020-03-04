import java.awt.*;

public class ReviewDriver {
    public static double sentimentVal (String word){
        return 0;
    }
    public static void main(String[]args){
        System.out.println(Review.sentimentVal("coach"));
        System.out.println(Review.sentimentVal("emory"));
        System.out.println(Review.sentimentVal("matt"));
        double num =sentimentVal("warm");

        System.out.println(Review.TotalSentiment("26WestReview.txt"));
    }
}