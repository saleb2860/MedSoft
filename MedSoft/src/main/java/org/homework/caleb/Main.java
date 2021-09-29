package org.homework.caleb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.homework.caleb.model.Config;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    private static Config config;

    private static String prompt() {
        System.out.println("Enter command or something: ");
        return scanner.nextLine();
    }


    /**
     * set everything up to run. like the scanner to read user input as well as load the configuration
     */
    private static void initialize() {
        // create a scanner for the prompt
        scanner = new Scanner(System.in);

        // object mapper is for reading in the config file
        // googling: "read a yaml file java"
        // https://www.baeldung.com/jackson-yaml
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        // this does something. don't know what. this was part of the tutorial.
        mapper.findAndRegisterModules();
        try {
            config = mapper.readValue(Main.class.getResource("/config.yml"), Config.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // starts the stuff
        initialize();
        System.out.println("config = " + config);

        String action;
        do {
            action = prompt();
        } while (!"exit".equals(action));

        // todo: draw an interface or something to show a list of symptoms, from config


        // todo: get the selected symptoms


        // todo: offer solutions?

        // todo: ???

        // todo: profit
    }
}
