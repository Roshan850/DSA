import java.io.*;
class fileHandling {
    public static void main(String[] args) {
        try (FileReader fout = new FileReader("abc.txt");
            FileWriter fin = new FileWriter("xyz.txt")) {

            int i;
            while ((i = fout.read()) != -1) {
                if (i >= 65 && i <= 90) { // Uppercase to lowercase
                    fin.write((char) (i + 32));
                } else if (i >= 97 && i <= 122) { // Lowercase to uppercase
                    fin.write((char) (i - 32));
                } else {
                    fin.write((char) i); // Non-alphabetical characters stay the same
                }
            }

            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("I/O Exception: " + e.getMessage());
        }
    }
}
