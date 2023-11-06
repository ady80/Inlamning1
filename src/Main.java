public class Main {
    public static void main(String[] args) {
        LineCharCount counter = new LineCharCount();
        TextInput textProcessor = new TextInput(counter);

        textProcessor.processText();
        textProcessor.printCharAndLineAmount();
    }
}
