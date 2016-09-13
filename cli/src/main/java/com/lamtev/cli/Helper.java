package com.lamtev.cli;

class Helper {

    public static void printHelpInfo() {
        System.out.println("notation_translator v1.0");
        System.out.println();
        System.out.println("Commands:");
        System.out.println("<integer,fraction> <original notation> <newNotation>");
        System.out.println("-h, -help, --help        print help information");
        System.out.println("-v, -version, --version  print version");
    }

    public static void printVersion() {
        System.out.println("1.0");
    }

    public static void printInvalidArguments() {
        System.out.println("Invalid arguments");
    }

}
