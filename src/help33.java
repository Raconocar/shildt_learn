public class help33 {
    public static void main(String args[])
            throws java.io.IOException {
        char choise, ignore;
        for (; ; ) {
            do {
                System.out.println("Инструкция if:\n");
                System.out.println("1. if ");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while");
                System.out.println("6. break");
                System.out.println("7. continue\n");
                System.out.println("q. Выход");
                choise = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

                if (choise == 'q') break;
                System.out.println(" \n");

            } while ((choise < '1' | choise > '7') & choise != 'q');




            switch (choise) {
                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println(" if (условие) инструкция;");
                    System.out.println(" else инструкция");
                    break;
                case '2':
                    System.out.println(" Инструкция switch:\n");
                    System.out.println(" switch (Выражение) {");
                    System.out.println("  case константа: ");
                    System.out.println("         последовательности инструкций");
                    System.out.println("  break;");
                    System.out.println(" // .... ");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Инструкция FOR  ");
                    break;
                case '4':
                    System.out.println("Инструкция WHILE");
                    break;
                case '5':
                    System.out.println("ИНструкция do-while");
                    break;
                case '6':
                    System.out.println("Инструкция break");
                    break;
                case '7':
                    System.out.println("инструкция continue");
                    break;

            }
            System.out.println();


        }
    }
}
