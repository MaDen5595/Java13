import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something: ");
        String e = scan.nextLine();
        System.out.println("You enter: "+e);
        //2
        System.out.println("Last symbol: "+e.charAt(e.length()-1));
        //3
        boolean e2 = e.endsWith("!!!");
        if(e2){
            System.out.println("Your line ends with '!!!'");
        }
        else{
            System.out.println("Your line doesnt ends with '!!!'");
        }
        //4
        e2 = e.startsWith("I love");
        if(e2){
            System.out.println("Your line starts with 'I love'");
        }
        else{
            System.out.println("Your line doesnt starts with 'I love'");
        }
        //5
        e2 = e.contains("Java");
        if(e2){
            System.out.println("Your line contains 'Java'");
        }
        else{
            System.out.println("Your line doesnt contains 'Java'");
        }
        //6
        int e3 = e.indexOf("Java");
        System.out.println("Position of 'Java': "+e3);
        //7
        String e4 = e.replace("a","o");
        System.out.println(e4);
        //8
        e4 = e.toUpperCase();
        System.out.println(e4);
        //9
        e4 = e.toLowerCase();
        System.out.println(e4);
        //10
        if(e.contains("Java")) {
            e4 = e.substring(e.indexOf("Java"), e.indexOf("Java") + 4);
            System.out.println(e4);
        }
        else{
            System.out.println("no java(");
        }
    }
}
