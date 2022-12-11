package timus;

public class timus1226 {

    public static void main(String[] args) {
        String str3 = "This is an example of a simple test. If you did not \n" +
                "understand the ciphering algorithm yet, then write the \n" +
                "letters of each word in the reverse order. By the way, \n" +
                "\"reversing\" the text twice restores the original text .";
        String[] words = new StringBuilder(str3).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }
}

