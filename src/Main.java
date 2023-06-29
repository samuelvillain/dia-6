public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "748 Itália", 2023, 130000);

        car.setModelo("X5");

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor de venda: " + car.valorVenda());


    }
}