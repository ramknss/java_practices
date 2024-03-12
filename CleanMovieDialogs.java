import java.io.*;
import java.util.*;

public class CleanMovieDialogs {
    public static void main(String[] args) {
		try{
			File in=new File("movie_dialogs.txt");
			FileWriter ob=new FileWriter(in,true);
			Scanner scanner = new Scanner(System.in);
			String x=scanner.nextLine();
			ob.write(x);
			ob.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
        try {
            File inputFile = new File("movie_dialogs.txt");
            Scanner scanner = new Scanner(inputFile);
            FileWriter outputFile = new FileWriter("clean_movie_dialogs.txt");
            Set<String> stopWords = new HashSet<>(Arrays.asList(
                "a", "an", "the", "is", "was", "were", "am", "are", "been",
                "be", "has", "have", "had", "and", "or", "but", "not", "in",
                "on", "at", "to", "from", "with", "of", "for", "that", "this",
                "these", "those", "it", "they", "he", "she", "we", "you", "i",
                "me", "him", "her", "us", "them", "my", "your", "his", "her",
                "our", "their", "its"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!stopWords.contains(word.toLowerCase())) {
                        outputFile.write(word.toLowerCase() + " ");
                    }
                }
                outputFile.write("\n");
            }
            scanner.close();
            outputFile.close();

            System.out.println("Successfully saved cleaned movie dialogs.");
        } catch (IOException e) {
            System.out.println("An error occurred while cleaning movie dialogs.");
            e.printStackTrace();
        }
    }
}
