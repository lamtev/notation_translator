package com.lamtev.notation_translator.cli;

import com.lamtev.notation_translator.core.StringParser;
import com.lamtev.notation_translator.core.Translator;
import com.lamtev.notation_translator.core.StringCompiler;

class Application {

    private String[] args;

    Application(String[] args) {
        this.args = args;
    }

    void run() {
        switch (args.length) {
            case 1:
                switchFirstArgument(args[0]);
                break;
            case 3:
                translate(args);
                break;
            default:
                Helper.printInvalidArguments();
        }
    }

    private void switchFirstArgument(String argument) {
        switch (argument) {
            case "-h":
            case "-help":
            case "--help":
                Helper.printHelpInfo();
                break;
            case "-v":
            case "-version":
            case "--version":
                Helper.printVersion();
                break;
            default:
                Helper.printInvalidArguments();
        }
    }

    private void translate(String[] args) {
        try {
            if (Integer.parseInt(args[1]) < 2 || Integer.parseInt(args[2]) > 16) {
                Helper.printInvalidArguments();
                return;
            }
            StringParser stringParser = new StringParser(args[0]);
            Translator translator = new Translator(
                    stringParser.integerPart(),
                    stringParser.fractionPart(),
                    Integer.parseInt(args[1]),
                    Integer.parseInt(args[2])
            );
            translator.translate();
            StringCompiler stringCompiler = new StringCompiler(translator.integerPart(), translator.fractionPart());
            System.out.println(stringCompiler.number());
        } catch (RuntimeException e) {
            Helper.printInvalidArguments();
            System.out.println(e.getMessage());
        }
    }

}
