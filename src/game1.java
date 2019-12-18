public class game1 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, ignore, answer = 'K';


        do {
            System.out.println("Задумана уква из диапазона A-Z.");
            System.out.println("Попытайтесь её угадать: ");
            //Получение символа с клавиатуры
            ch = (char) System.in.read();
            //отбрасывание всех остальных символов во вводе
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("Опачки! правильно");
            else {
                System.out.println("Маленько мимо в сторонуу...");
                if (ch < answer) System.out.println("Начала");
                else System.out.println("Конца");

                System.out.println(" Бейся лбом дальше");
            }
        } while (answer != ch);
    }

}
