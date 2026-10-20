import java.util.Arrays;

public class TextManipulation {


    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyz";

    public static String convertToUpperCase(String string)
    {
        return string.toUpperCase();
    }

    public static String convertToLowerCase(String string)
    {
        return string.toLowerCase();
    }

    public static boolean isAnagram(String a, String b)
    {
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

    public static String reverseString(String a)
    {
        return new StringBuilder(a).reverse().toString();
    }

    public static String caesarCipherCode(String input, int cyperShift)
    {
        StringBuilder result = new StringBuilder();
        int n = ALPHABET.length();

        for (char c : input.toLowerCase().toCharArray())
        {
            int index = ALPHABET.indexOf(c);
            if (index == -1)
            {
                result.append(c);
            }
            else
            {
                int newIndex = ((index + cyperShift) % n + n) % n;
                result.append(ALPHABET.charAt(newIndex));
            }
        }
        return result.toString();
    }

    public static String caesarCipherDecode(String input, int cyperShift)
    {
        return caesarCipherCode(input, -cyperShift);
    }
}