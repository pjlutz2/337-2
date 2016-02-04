/**
 * Created by Peter on 2/4/2016.
 */
public class BeerSong {

    public static void main(String[] args) {
    Ninety_Nine_Bottles_Of_Beer();

    }


    public static void Ninety_Nine_Bottles_Of_Beer(){

        for (int i=99; i >=1 ; i--)
            if (i > 2) {
                System.out.println(i + " Bottles of beer on the wall, " + i + " bottles of beer");
                System.out.println("take one down, pass it around, "+ (i-1) +" bottles of beer on the wall.");
            }
            else if (i==2){
                System.out.println(i + " Bottles of beer on the wall, " + i + " bottles of beer");
                System.out.println("take one down, pass it around, "+ (i-1) +" bottle of beer on the wall.");
            }

            else if (i == 1) {
                System.out.println(i + " Bottle of beer on the wall, " + i + " bottle of beer");
                System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            }

    }
}
