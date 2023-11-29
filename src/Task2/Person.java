package Task2;

public class Person {
    private String name = "empty";
    private String surname;
    private String otchestvo = "empty";
    Person(String surmane){
        this.surname = surmane.toUpperCase().charAt(0) + surmane.substring(1).toLowerCase();
    }
    Person(String surname,String name){
        this.surname = surname.toUpperCase().charAt(0) + surname.substring(1).toLowerCase();
        this.name = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
    }
    Person(String surname,String name,String otchestvo){
        this.surname = surname.toUpperCase().charAt(0) + surname.substring(1).toLowerCase();
        this.name = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        this.otchestvo = otchestvo.toUpperCase().charAt(0) + otchestvo.substring(1).toLowerCase();
    }
    public String getFIO(){
        String ret = this.surname;
        if(!this.name.equals("empty")){
            ret = ret + " " + this.name.charAt(0)+".";
        }
        if(!this.otchestvo.equals("empty")){
            ret = ret + " " + this.otchestvo.charAt(0)+".";
        }
        return ret;
    }
}
