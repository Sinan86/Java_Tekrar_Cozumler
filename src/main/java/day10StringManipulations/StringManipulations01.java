package day10StringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

    String a ="Java kolaydir.";
    boolean b = a.startsWith("va",2);
        System.out.println(b);

        String c = a.replaceFirst("a","*");
        System.out.println(c);
        String d = a.replace("a","*");
        System.out.println(d);
        String f = a.concat(" Anladin mi?");
        System.out.println(f);
        String e = "   Tom Hanks    ";
        String g = e.trim();
        System.out.println(g);
        String h = "Java";
        String i = "java";
        int k = h.compareTo(i);
        System.out.println(k);
        int l = h.compareToIgnoreCase(i);
        System.out.println(l);
        String n = a.repeat(5);
        System.out.println(n);



    }


}
