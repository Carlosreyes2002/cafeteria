public class CafeteriaVirtual {
    public static void main(String[] args) {

        Bebida cafe = new Cafe();


        cafe = new Leche(cafe);


        cafe = new Chocolate(cafe);


        System.out.println("Descripción: " + cafe.getDescripcion());
        System.out.println("Costo Total: $" + cafe.getCosto());
    }
}
