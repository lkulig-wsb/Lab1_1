import java.util.Scanner; //importowanie pakietu java.util który zawiera klasę Scanner
public class Hello {
    public static void main(String[] args) {

        //Scanner służy do odczytywania danych wejściowych od użytkownika z konsoli.
        // Poniżej, inicjalizacja obiektu Scanner do odczytu danych wejściowych.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane studenta");
        System.out.print("Imię: ");
        // Użycie obiektu scanner do odczytania tekstu wprowadzonego z konsoli i przypisanie do zmiennej
        // 'imie', która jest typu String
        String imie = scanner.nextLine();
        System.out.print("Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Uczelnia: ");
        String uczelnia = scanner.nextLine();
        System.out.print("Kierunek: ");
        String kierunek = scanner.nextLine();
        System.out.print("Rok: ");
        int rok = scanner.nextInt();
        System.out.print("Grupa: ");
        // Użycie obiektu scanner do odczytania ciągu znaków, a następnie pobranie pierwszego znaku z tego ciągu
        // i przypisanie go do zmiennej 'grupa', która jest typu char
        char grupa = scanner.next().charAt(0);


        //Wyswietlenie podstawowych info. o studencie za pomocą metody System.out.println
        //z użyciem wcześniej zdefiniowanych zmiennych, które są zainicjalizowane za pomocą klasy Scanner
        System.out.println("\n=== PODSTAWOWE INFO O STUDENCIE ===");
        System.out.println("-------------------------------------");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Uczelnia: " + uczelnia);
        System.out.println("Kierunek: " + kierunek);
        System.out.println("Rok: " + rok);
        System.out.println("Grupa: " + grupa);


    }
}