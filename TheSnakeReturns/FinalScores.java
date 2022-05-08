import java.io.*;
import java.util.*;

public class FinalScores {

    public FinalScores() {
    }


    public ArrayList<Integer> readFile() {
        String line;
        ArrayList<Integer> scores = new ArrayList<>();
        try {
            File myObj = new File("scores.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                FileWriter myWriter = new FileWriter("scores.txt");
                myWriter.write("0");
                myWriter.close();
            } else {
                FileReader fr = new FileReader("scores.txt");
                BufferedReader br = new BufferedReader(fr);
                line = br.readLine();

                System.out.println("Liens"+line);
                while (line != null) {
                    scores.add(Integer.parseInt(line));
                    line = br.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Exception" + e);
        }
        return scores;
    }

    public void writeFile(int score) {
        try {
            FileWriter myWriter = new FileWriter("scores.txt");
            System.out.println("Score in write==" + score);
            myWriter.write(""+score);
            myWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
