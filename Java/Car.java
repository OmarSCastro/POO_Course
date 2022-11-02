class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car( String license, Account driver ) {
        this.license= license;
        this.driver= driver;
    }

    void printDataCar(){
        System.out.println("License: "+ license + "Driver: "+ driver.name);
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassegner(Integer passenger){
        if(passenger === 4){
            this.passenger= passenger;
        } else {
            System.out.println("Necesitas asignar cuatro pasajeros");
        }
    }

    
}