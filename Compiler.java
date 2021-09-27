import java.util.*;
import java.io.*;

class Compiler {
    public static void main(String args[]) {
        try {
            double version = 1.0;
            boolean inmain = false;

            if (args[0].equals("--help")) {
                System.out.println("java Compiler.java [Shock_File_Name] : runs Shock files");
                System.out.println("java Compiler.java --help : list of commands");
                System.out.println("java Compiler.java --version : find current Shock version");
                System.exit(0);
            } else if (args[0].equals("--version")) {
                System.out.print("Shock ");
                System.out.print(version);
                System.out.println(" Beta");
                System.exit(0);
            }
            String file_name = args[0];
            File file = new File(file_name);
            Scanner Reader = new Scanner(file);

            int line = 0;
            String data = null;

            do {
                line++;
                data = read(data, line, Reader);
            } while (data.equals(""));

            String[] data_list = data.split(" ");

            if (date_list[0] == "import") {

            } else if (data_list[0] == "int" || data_list[0] == "float" || data_list[0] == "String" || data_list[0] == "Boolean") {
                
            } else if (data_list[0] = "void") {
                if (data_list[1] != "main") {
                    
                }
            
            } else {
                System.out.print("Error: on line ");
                System.out.println(line);
                System.out.print("   ");
                System.out.println(data);
                System.exit(0);
            }

            System.out.println(data_list[0]);

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
}
