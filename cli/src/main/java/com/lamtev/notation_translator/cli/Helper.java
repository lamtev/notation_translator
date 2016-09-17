package com.lamtev.notation_translator.cli;

class Helper {

    static void printHelpInfo() {
        System.out.println("notation_translator v1.1");
        System.out.println();
        System.out.println("Usage: notation_translator [command]");
        System.out.println("Commands:");
        System.out.println();
        System.out.println("-h, -help, --help        print help information");
        System.out.println("-v, -version, --version  print version");
        System.out.println();
        System.out.println("<integer,fraction> <original notation> <new notation> [<accuracy>]");
        System.out.println();
        System.out.println("All the numbers in <integer,fraction> must be smaller than <original notation>!!!");
        System.out.println("Supported notations: 2 - 36");
        System.out.println("Default value of accuracy is 8");
        System.out.println();
    }

    static void printVersion() {
        System.out.println("1.2");
    }

    static void printInvalidArguments() {
        System.out.println("Invalid arguments");
    }

}
