//Adapted code from: //https://www.w3schools.com/java/java_files_create.asp
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HighScoreSaver {
    public static void main(String[] args) {
    }
    public static Path getHighScorePath() {
        return Paths.get(System.getProperty("user.home", "."), ".stratasnake", "highScoreTable.txt");
    }
    public static void SaveHighScore(HighScoresList[] highScoresArray){
        try {
            Path path = getHighScorePath();
            Files.createDirectories(path.getParent());
            File myObj = path.toFile();
            FileWriter myWriter = new FileWriter(myObj);
            for (int i = highScoresArray.length - 1; i >= 0; i--) {
                myWriter.write(highScoresArray[i].getInitials() + "," +
                        highScoresArray[i].getScore() + "," +
                        + highScoresArray[i].getLevel() + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
