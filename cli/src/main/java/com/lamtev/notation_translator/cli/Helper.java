package com.lamtev.notation_translator.cli;

class Helper {

    static void printHelpInfo() {
        System.out.println("notation_translator v1.0");
        System.out.println();
        System.out.println("Usage: notation_translator [command]");
        System.out.println("Commands:");
        System.out.println("<integer,fraction> <original notation> <new notation> [<accuracy>]");
        System.out.println("-h, -help, --help        print help information");
        System.out.println("-v, -version, --version  print version");
    }

    static void printVersion() {
        System.out.println("1.0");
    }

    static void printInvalidArguments() {
        System.out.println("Invalid arguments");
    }

}
