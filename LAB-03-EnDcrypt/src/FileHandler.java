import java.io.*;

public class FileHandler {
    
    // public void createFile(){
    //     try {
    //     File myObj = new File("encryptedFile.txt");
    //     if (myObj.createNewFile()) {
    //         System.out.println("File created: " + myObj.getName());
    //     } else {
    //         System.out.println("File already exists.");
    //     }
    //     } catch (IOException e) {
    //     System.out.println("An error occurred.");
    //     e.printStackTrace();
    //     }
    // }

    public String readFile(String inputFilePath) {
        StringBuilder content = new StringBuilder();

        // Try to read the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");  // Append each line and a new line character
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        return content.toString();  // Return the content as a String
    } 

    public void createFile(String outputFilePath, String content) {
        // Try to write the content to the file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write(content);  // Write the entire content to the file
            System.out.println("File created successfully at: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
