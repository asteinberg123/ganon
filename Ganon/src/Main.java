import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String arr[]) throws FileNotFoundException {


        double KB1 = 0.00;
        double KB2 = 1.00;
        double percent = 0;
        double staleness = 1.05;
        double weight = 0.00;
        double kbg1 = 93.00;
        double bkb1 = 20.00;
        double kbg2 = 86.00;
        double bkb2 = 40.00;
        double damage1 = 18.00;
        double damage2 = 17.00;
        PrintStream o = new PrintStream(new File("A.txt"));
        System.setOut(o);
        System.out.println("Weight          Percent\n");
        while (weight < 136.00)

        {
            while (KB1 < KB2) {
                percent = percent + 1;
                KB1 = (((((((percent + damage1 * staleness) / 10 + (((percent + damage1 * staleness) * damage1 * (1 - (1 - staleness) * 0.3)) / 20)) * 1.4 * (200 / (weight + 100))) + 18) * (kbg1 / 100)) + bkb1));
                KB2 = (((((((percent + damage2 * staleness) / 10 + (((percent + damage2 * staleness) * damage2 * (1 - (1 - staleness) * 0.3)) / 20)) * 1.4 * (200 / (weight + 100))) + 18) * (kbg2 / 100)) + bkb2));
            }
            System.out.println(weight + "                   " + percent + "\n");
            weight++;
            percent = 0.00;
            KB1 = 0.00;
            KB2 = 1.00;
        }
    }
}
