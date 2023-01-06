package hu.nive.ujratervezes.decoder;

public class Coder {
    public int[] codeText(String text) {
        int[] code = new int[text.length()];
        int firstLetterAscii = text.charAt(0);
        code[0] = (int) Math.sqrt(firstLetterAscii);
        char[] textAsCharArray = text.toCharArray();

        code[1] = ((int) textAsCharArray[1] - firstLetterAscii);

        for (int i = 2; i < textAsCharArray.length; i++) {
            code[i] = ((int) textAsCharArray[i] - (int) textAsCharArray[i - 1]);
        }

        return code;
    }
}
