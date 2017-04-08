/**
 * Created by ARPITHA RAO on 15-01-2016.
 */
class Books{
    String title;
    String author;
}
public class TestArray {
    public static void main(String args[]){

        Books[] mybooks = new Books[3];
        int x = 0;
        mybooks[0] = new Books();
        mybooks[1] = new Books();
        mybooks[2] = new Books();
        mybooks[0].author = "Jeffrey Archer";
        mybooks[1].author = "Dan Brown";
        mybooks[2].author = "Sidney Sheldon";
        mybooks[0].title = "Only time can tell";
        mybooks[1].title = "Inferno";
        mybooks[2].title = "Master of the Game";
        for (x=0; x<3; x++){
            System.out.println("My favorite author # "+ (x+1) +" "+ mybooks[x].author + " and his famous book "+ mybooks[x].title);

        }


    }
}
