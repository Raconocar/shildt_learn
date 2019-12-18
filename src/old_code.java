
public class old_code {
    public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;
        do {
            System.out.println("1. if");
            System.out.println("2. Switch");
            System.out.println("3. For");
            System.out.println("4. While");
            System.out.println("5. Do-while");
            System.out.print("Выбирай стул:");
            choice = (char) System.in.read();
            do {
                ignore=(char) System.in.read();

            } while (ignore!='\n');
        } while (ignore!='\n');
    }
//comment here for git
}