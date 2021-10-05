import java.util.*;
import java.io.*;

class Compiler {
    public static void main(String args[]) {
        try {
            // defining variables and arrays
            double version = 1.0;
            boolean inmain;
            String[][] functions;
            String[][] variables;
            int x = 0;
            int y = 0;

            // if user enters help command
            if (args[0].equals("--help")) {
                System.out.println("java Compiler.java [Shock_File_Name] : runs Shock files");
                System.out.println("java Compiler.java --help : list of commands");
                System.out.println("java Compiler.java --version : find current Shock version");
                System.exit(0);
            // if user enters version command
            } else if (args[0].equals("--version")) {
                System.out.print("Shock ");
                System.out.print(version);
                System.out.println(" Beta");
                System.exit(0);
            }
            // if neither, then the user must have entered the file they want compiled
            // initializing shock file and Reader
            String file_name = args[0];
            File file = new File(file_name);
            Scanner Reader = new Scanner(file);

            // initializing data (String that holds each line of Shock code)
            // initializing line (integer that keeps track of the line the reader is on)
            int line = 0;
            String data = null;

            do {

                if (Reader.hasNextLine == false) {
                    break;
                }

                // read first line of code, excluding the empty ones
                do {
                    line++;
                    data = read(data, line, Reader);
                } while (data.equals(""));

                // initializing array to hold a split version of the line currently being analized
                String[] data_list = data.split(" ");

                // code for if the first line of code is an import statement
                if (data_list[0] == "import") {

                // code for if the first line of code is the initialization of a variable or a function
                } else if (data_list[0] == "int" || data_list[0] == "float" || data_list[0] == "String" || data_list[0] == "Boolean") {
                    // check if it is a function
                    if (data_list.asList().contains("(")) {
                        String[] data1 = data_list[1];
                        // the code will save the name of the function and everything inside it to a 2d array called functions
                        String[] data2 = data_list[1].split("(");
                        functions[x][y] = data2[0];
                        y++;
                        data = "{";
                        while (data != "}") {
                            if (data != "{") {
                                functions[x][y] = data;
                                y++;
                            }
                            data = read(data, line, Reader);
                            line++;
                        }
                    // if it is a variable
                    } else {

                    }
                // check if it is a function that starts with "void"
                } else if (data_list[0] == "void") {
                    // check if it is the main function
                    if (data1[0] == "m" && data1[1] == "a" && data1[2] == "i" && data1[3] == "n") {

                    } else {
                        String[] data1 = data_list[1];
                        if (data1[0] == "m" && data1[1] == "a" && data1[2] == "i" && data1[3] == "n") {

                        } else {
                            String[] data2 = data_list[1].split("(");
                            functions[x][y] = data2[0];
                            y++;
                            data = "{";
                            while (data != "}") {
                                if (data != "{") {
                                    functions[x][y] = data;
                                    y++;
                                }
                                data = read(data, line, Reader);
                                line++;
                            }
                        }
                    }
                } else {
                    error(line, data);
                }
            
            } while(Reader.hasNextLine());

            Reader.close();
        } catch (Error e) {
            //System.out.println(e);
        } catch (Exception E) {
            //System.out.println(E);
        }
    }

    public static String read(String data, int line, Scanner Reader) {
        data = Reader.nextLine();
        return data;
    }

    public static void error(int line, String data) {
        System.out.print("Error: on line ");
        System.out.println(line);
        System.out.print("   ");
        System.out.println(data);
        System.out.println("\nUnidentified Syntax");
        System.exit(0);
    }
}

public class integer {
    String name;
    int value;
}

public class string {
    String name;
    String value;
}

public class Float {
    String name;
    float value;
}

public class integer {
    String name;
    int value;
}