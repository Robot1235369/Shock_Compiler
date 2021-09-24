class Compiler {
    public static void main(String args[]) {
        try {
            double version = 1.0;
            if (args[0].equals("--help")) {
                System.out.println("java Compiler.java [Squirrel_File_Name] : runs Squirrel files");
                System.out.println("java Compiler.java --help : list of commands");
                System.out.println("java Compiler.java --version : find current Squirrel version");
                System.exit(0);
            } else if (args[0].equals("--version")) {
                System.out.print("Squirrel ");
                System.out.println(version);
                System.exit(0);
            }
            String file = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e);
        }
    }
}