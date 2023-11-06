public class LineCharCount {
    private int lineCount = 0;
    private int charCount = 0;

    // Metod för att uppdatera statistiken
    public void updateLineCharCount(String text) {
        lineCount++; // lineCount = lineCount + 1;
        charCount += text.length();
    }

    // Getter-metoder för att hämta statistiken
    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }
}
