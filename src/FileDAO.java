import java.io.*;
import java.util.Scanner;

public class FileDAO implements CountryDAO {
    Scanner scnr = new Scanner(System.in);

    @Override
    public void addCountry(Country country) {
        try {
            //if the test.txt file does not exist FileWriter will create it
            FileWriter writer = new FileWriter("countries.txt", true);
            writer.write("\n");
            System.out.println("What Country name would you like to add?");
            String addedCountry = scnr.nextLine();
            writer.write(addedCountry);
            System.out.println(addedCountry + " was added");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteCountry(Country country) {

    }

    @Override
    public void updateCountry(COuntry country) {
        try {
            File myFile = new File("countries.txt");
            // FileReader is a connection stream for characters that connects to a text file

            FileReader reader = new FileReader(myFile);

            //BufferedReader allows the File Reader to chain to it
            //it only goes back to check the file once the buffer is empty
            BufferedReader buff = new BufferedReader(reader);
            //declare a string variable to hold each line as it's read from the file
            String line = null;

            //this while loop says read a line for text then assign it to the string line
            //while that variable is not null keep printing lines
            while ((line = buff.readLine()) != null) { // changed catch to General Exception
                System.out.println(line);
            }
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}