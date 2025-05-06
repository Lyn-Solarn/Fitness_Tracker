
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class Fitness_Tracker_Test {
    Tracker tracker;
    static final String location = "src/test/java/";
    static final String logFilename = location + "log.txt";
    static FileOutputStream logWriter;
    static PrintStream oldOut;

    @BeforeAll
    static void logSetup() throws IOException {
        oldOut = System.out;
        logWriter = new FileOutputStream(logFilename);
        PrintStream ps = new PrintStream(logWriter);
        System.setOut(ps);
    }

    @AfterAll
    static void logClose() throws IOException {
        logWriter.close();
        System.setOut(oldOut);
    }

    @BeforeEach
    void setup(){
        tracker = new Tracker();
    }
}
