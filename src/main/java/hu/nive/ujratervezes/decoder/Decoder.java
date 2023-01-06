package hu.nive.ujratervezes.decoder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Decoder {
    public String decode(int[] code) {
        if (code == null) {
            throw new IllegalArgumentException();
        }

        if (code.length == 0) {
            return "";
        }

        int[] codeAsAscii = getAsAscii(code);

        return Arrays.stream(codeAsAscii).mapToObj(c -> (char) c).map(Object::toString).collect(Collectors.joining());
    }

    private static int[] getAsAscii(int[] code) {
        int[] codeAsAscii = new int[code.length];
        codeAsAscii[0] = code[0] * code[0];
        for (int i = 1; i < code.length; i++) {
            codeAsAscii[i] = codeAsAscii[i - 1] + code[i];
        }
        return codeAsAscii;
    }
}
