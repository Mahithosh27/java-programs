public class reverseSentence {
    public static void main(String[] args) {
        String str = "hi this is mahithosh";
        System.out.println(str);
        String rev = revsen(str);
        System.out.println(rev);

    }

    static String revsen(String str) {
        String[] words = str.split("\\s");
        String sentence = "";
        for (String Word : words) {
            String rev = rev(Word);
            sentence += rev + " ";
        }
        return sentence;
    }

    static String rev(String words) {
        StringBuilder rev = new StringBuilder();
        for (int i = words.length() - 1; i >= 0; i--) {
            rev.append(words.charAt(i));
        }
        return rev.toString();
    }


}