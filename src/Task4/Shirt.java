package Task4;

public class Shirt {
    private String position;
    private String name;
    private String color;
    private String size;
    Shirt(String shirt){
        String[] mas = shirt.split(",");
        this.position = mas[0];
        this.name = mas[1];
        this.color = mas[2];
        this.size = mas[3];
    }

    @Override
    public String toString() {
        return "Shirt{\n" +
                " position='" + position + '\'' +
                ",\n name='" + name + '\'' +
                ",\n color='" + color + '\'' +
                ",\n size='" + size + '\'' +
                '}';
    }
}
