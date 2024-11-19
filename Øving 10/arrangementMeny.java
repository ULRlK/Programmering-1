// Purpose: Main class forArrangementRegister.java
//
import java.math.BigInteger;    
import java.util.Scanner;

public class arrangementMeny {
    
    public static void main(String[] args) {
        Arrangement a1 = new Arrangement(1, "Fortnite", "Horten", "Ulrik", "Turnering", new BigInteger("202411072000"));
        ArrangementRegister register = new ArrangementRegister(a1);
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("1. Add arrangement");
                System.out.println("2. Remove arrangement");
                System.out.println("3. Get arrangement by place");
                System.out.println("4. Get arrangement by organizer");
                System.out.println("5. Get arrangement by type");
                System.out.println("6. Get arrangement by time");
                System.out.println("7. Sort arrangements by place");
                System.out.println("8. Sort arrangements by type");
                System.out.println("9. Sort arrangements by time");
                System.out.println("10. Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter number:");
                        int number = scanner.nextInt();
                        System.out.println("Enter name:");
                        String name = scanner.next();
                        System.out.println("Enter place:");
                        String place = scanner.next();
                        System.out.println("Enter organizer:");
                        String organizer = scanner.next();
                        System.out.println("Enter type:");
                        String type = scanner.next();
                        System.out.println("Enter time:");
                        BigInteger time = scanner.nextBigInteger();
                        register.addArrangement(new Arrangement(number, name, place, organizer, type, time));
                        break;
                    case 2:
                        System.out.println("Enter number:");
                        int numberToRemove = scanner.nextInt();
                        register.removeArrangement(numberToRemove);
                        break;
                    case 3:
                        System.out.println("Enter place:");
                        String placeToGet = scanner.next();
                        register.getArrangementPlace(placeToGet).getArrangementer().forEach(arrangement -> System.out.println(arrangement.getName()));


                        break;
                    case 4:
                        System.out.println("Enter organizer:");
                        String organizerToGet = scanner.next();
                        register.getArrangementOrganizer(organizerToGet).getArrangementer().forEach(arrangement -> System.out.println(arrangement.getName()));
                        break;
                    case 5:
                        System.out.println("Enter type:");
                        String typeToGet = scanner.next();
                        register.getArrangementType(typeToGet).getArrangementer().forEach(arrangement -> System.out.println(arrangement.getName()));
                        break;
                    case 6:
                        System.out.println("Enter time from:");
                        BigInteger timeFrom = scanner.nextBigInteger();
                        System.out.println("Enter time to:");
                        BigInteger timeTo = scanner.nextBigInteger();
                        register.getArrangementTime(timeFrom, timeTo).getArrangementer().forEach(arrangement -> System.out.println(arrangement.getName()));
                        break;

                    case 7:
                        register.sortArrangementsByPlace();
                        System.out.println("Arrangementer sortert etter sted:");
                        register.getArrangementer().forEach(System.out::println); // Antar at getArrangementer returnerer listen
                        break;
                    case 8:
                        register.sortArrangementsByType();
                        System.out.println("Arrangementer sortert etter type:");
                        register.getArrangementer().forEach(System.out::println);
                        break;
                    case 9:
                        register.sortArrangementsByTime();
                        System.out.println("Arrangementer sortert etter tidspunkt:");
                        register.getArrangementer().forEach(System.out::println);
                        break;

                    case 10:
                        running = false;
                        break;
                        
}
}
        }
}
}
