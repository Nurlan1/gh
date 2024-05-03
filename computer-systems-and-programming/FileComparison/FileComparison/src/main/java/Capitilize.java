import java.util.Locale;

public class Capitilize {
    public static void main(String[] args) {
        String str = "hello world";
        String[] words = str.split(" ");
        String str1="";
        for (int i=0;i< words.length; i++){
             str1+=Character.toUpperCase(words[i].charAt(0))+words[i].substring(1)+" ";
        }
        str1=str1.trim();
        System.out.println(str1);
    }
}
