package Methods;

public class CountOfWords {
    public static void main(String[] args) {
        String text = "Nar ine Adam,yan ";
        int words = findTheWords(text);
        System.out.println("Number of words: " + words);
    }

    static int findTheWords(String text) {
        int counter = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (currentChar != ' ' && currentChar != '\n' && currentChar != '\t') {
                if (!inWord) {
                    counter++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return counter;
    }
}
