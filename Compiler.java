class Compiler {
    public static void main(String args[]) {
        try {
            throw new AssertionError();
            double version = 1.0;
            if (args[0].equals("--help")) {
                System.out.println("java Compiler.java [Shock_File_Name] : runs Shock files");
                System.out.println("java Compiler.java --help : list of commands");
                System.out.println("java Compiler.java --version : find current Shock version");
                System.exit(0);
            } else if (args[0].equals("--version")) {
                System.out.print("Shock ");
                System.out.print(version);
                System.out.println(" Beta")
                System.exit();
            } else {
                String file = args[0];
            }
        } catch (Error e) {
            System.out.println(getClass().getSimpleName(e));
        }
    }
}
