package hu.nive.ujratervezes.decoder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String text0 = "ddd";
        String text1 = "delete";
        String text2 = "youAreDoingGreat";
        String text3 = "Queen Of England";

        Coder coder = new Coder();

        int[] zeroCode = coder.codeText(text0);
        int[] firstCode = coder.codeText(text1);
        int[] secondCode = coder.codeText(text2);
        int[] thirdCode = coder.codeText(text3);

        Arrays.stream(firstCode).forEach(System.out::println);

        Decoder decoder = new Decoder();

//        System.out.println(decoder.decode(zeroCode));
//        System.out.println(decoder.decode(firstCode));
//        System.out.println(decoder.decode(secondCode));
//        System.out.println(decoder.decode(thirdCode));
    }
}