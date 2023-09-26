package bg.softuni.fundamentals.textProcessing;

public class Methods {
    public static String repeat(String word, int count) {
        String[] repeatArr = new String[count];
        for(int i = 0; i < count; i++){
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }

}
