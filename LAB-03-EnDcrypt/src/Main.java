import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Encryption Algorithm\n1 - AES\n2 - DES\n3 - CaesarCipher");
        int algo = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println(algo);
        
        AlgoHandler algoHandler = new AlgoHandler();
        switch (algo) {
            case 1:
                algoHandler.setAlgorithm(new AES());
                // algoHandler.encrypt("")
                break;
            case 2:
                algoHandler.setAlgorithm(new DES());
                break;
            case 3:
                algoHandler.setAlgorithm(new CaesarCipher(5));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        FileHandler fileHandler = new FileHandler();
        System.out.println("Input File path:\n");
        String inputFilePath = scanner.nextLine();

        // F:\Study Materials\Sem 3.1\SWE 4502 - DP Lab\dp_lab_167\LAB-03-EnDcrypt\src\input.txt
        String fileContent = fileHandler.readFile(inputFilePath);
        System.out.println("Read from input file:\n" + fileContent);
        
        String encryptedContent = algoHandler.encrypt(fileContent);
        System.out.println("Encypted content:\n" + encryptedContent);
        
        System.out.println("Ouptut File path:\n");
        String outputFilePath = scanner.nextLine();
        fileHandler.createFile(outputFilePath, encryptedContent);

        scanner.close();
    }
}