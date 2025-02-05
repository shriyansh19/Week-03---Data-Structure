package inputstreamreader;

import static inputstreamreader.bytetocharacterstream.ByteToCharacterStream.readFile;

public class Main {
    public static void main(String[] args) {
        String filePath = "example.bin"; // Replace with the path to your binary file
        readFile(filePath);
    }
}
