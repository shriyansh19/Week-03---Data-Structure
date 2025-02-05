package inputstreamreader.userinputtofile;

import static inputstreamreader.userinputtofile.UserInputToFile.writeUserInputToFile;

public class Main {
    public static void main(String[] args) {
        String filePath = "user_input.txt"; // Replace with the desired output file path
        writeUserInputToFile(filePath);
    }
}
