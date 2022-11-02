Class Main {
    public static void main(String[] args) {
     UberX uberX = new UberX("ABC12312", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
     uberX.setPassegner(3);
     uberX.printDataCar();

     Car car2 = new Car("DEF232", new Account("Mauricio Suarez", "IFE123"));
     car2.passenger= 3;
     car2.printDataCar();
    }
}