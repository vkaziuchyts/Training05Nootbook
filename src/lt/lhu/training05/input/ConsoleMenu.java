package lt.lhu.training05.input;

import java.util.Scanner;

public class ConsoleMenu {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
 
        while (!"4".equals(s)){
            System.out.println("1. Для поиска записи в блокноте по содержанию введите  - 1");
            System.out.println("2. Для поиска  записи в блокноте по дате создания введите - 2");
            System.out.println("3. Для просмотра всех записей введите - 3");
            System.out.println("4. Для выхода из приложения введите 4");
            s = scan.next();
                        
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }
            
            switch (x){
                case 1:
                    // вызов метода 1
                    break;
                case 2:
                    // вызов метода 2
                    break;
                case 3:
                    // вызов метода 3
            }
        }
        System.out.println("До свидания!");
    }

}
