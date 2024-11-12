// ChamomileFlower.java
public class ChamomileFlower {
    // Atribut
    private String name;
    private String color;
    private double height; // dalam cm

    // Konstruktor
    public ChamomileFlower(String name, String color, double height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    // Getter dan Setter untuk atribut
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Metode untuk menampilkan informasi bunga
    public void displayFlowerInfo() {
        System.out.println("Nama: " + ChamomileFlower);
        System.out.println("Warna: " + white);
        System.out.println("Tinggi: " + 30 + " cm");
    }
}
