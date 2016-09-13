package com.lamtev.cli;

import static com.lamtev.cli.Helper.*;
import com.lamtev.core.StringParser;
import com.lamtev.core.Translator;
import com.lamtev.core.StringCompiler;

//TODO notations validation
//TODO fix RuntimeException

class Application {

    String[] args;

    Application(String[] args) {
        this.args = args;
    }

    public void run() {
        switch (args.length) {
            case 1:
                switchFirstArgument(args[0]);
                break;
            case 3:
                runTranslator(args);
                break;
            default:
                printInvalidArguments();
        }
    }

    private void switchFirstArgument(String argument) {
        switch (argument) {
            case "-h":
            case "-help":
            case "--help":
                printHelpInfo();
                break;
            case "-v":
            case "-version":
            case "--version":
                printVersion();
                break;
            default:
                printInvalidArguments();
        }
    }

    private void runTranslator(String[] args) {
        try {
            StringParser stringParser = new StringParser(args[0]);
            System.out.println("here");
            Translator translator = new Translator(
                    stringParser.integerPart(),
                    stringParser.fractionPart(),
                    Integer.getInteger(args[1]),
                    Integer.getInteger(args[2]));
            System.out.println("here");
            translator.translate();
            System.out.println("here");
            StringCompiler stringCompiler = new StringCompiler(translator.integerPart(), translator.fractionPart());
            System.out.println("here");
            System.out.println(stringCompiler.number());
            System.out.println("here");
        } catch (RuntimeException e) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
            printInvalidArguments();
        }
    }

}
