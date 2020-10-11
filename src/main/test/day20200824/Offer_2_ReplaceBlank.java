package day20200824;

public class Offer_2_ReplaceBlank {
    public static void main(String[] args) {
        String str = "a is first";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                builder.append("%20");
            else
                builder.append(str.charAt(i));
        }
        System.out.println(builder.toString());
    }
}
