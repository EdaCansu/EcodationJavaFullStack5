package javase;

public class _04_String {
    public static void main(String[] args) {
        /*String value="javase JavaME JAvase ";
        System.out.println(value.length());
        System.out.println(value.trim().length());
        System.out.println(value.startsWith("javase"));
        System.out.println(value.endsWith(" "));
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
        System.out.println(value.charAt(0));
        System.out.println(value.indexOf("javase"));
        value=value.replace(value,"javase JavaME JAvase javaEE ");
        System.out.println(value);
        value=value.concat("sonuna ekler");
        System.out.println(value);
        System.out.println(value.contains("JavaME"));
        System.out.println(value.isEmpty());
        System.out.println(value.equals("javase JavaME JAvase javaEE sonuna ekler"));

        System.out.println( value.substring(2));
        if(value.length()>3){
            System.out.println( value.substring(0,3)); //0<=X<=3-1
            }*/

        String word = " Eda Cansu Canım  ";
        System.out.println(word.length());
        System.out.println(word.trim().length());
        System.out.println(word.startsWith(" Eda"));
        System.out.println(word.endsWith(" "));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.charAt(1));
        System.out.println(word.indexOf("Eda"));
        word = word.replace("Eda", "Edoş");
        System.out.println(word);
        word= word.concat("Benim");
        System.out.println(word);
        System.out.println(word);
        System.out.println(word.contains("Edoş"));
        System.out.println(word.isEmpty());
        System.out.println(word.equals(" Edoş Cansu Canım  Benim"));
    }
}
