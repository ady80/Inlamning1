import java.util.Scanner;

public class TextInput {
    private LineCharCount charCounter;

    public TextInput(LineCharCount counter) {
        this.charCounter = counter;
    }

    public void processText() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Skriv in text och skriv in STOP när du är klar:");
            String text = scan.nextLine();

            if (text.equalsIgnoreCase("stop")) {
                break;
            }

            charCounter.updateLineCharCount(text);
            System.out.println("Du skrev: " + text);
        }
        scan.close();
    }

    public void printCharAndLineAmount() {
        System.out.println("Antal rader: " + charCounter.getLineCount());
        System.out.println("Antal tecken: " + charCounter.getCharCount());
    }


}

