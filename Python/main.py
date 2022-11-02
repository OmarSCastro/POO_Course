from account import Account
from car import Car

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("AMS234", Account("Andres Herrera", "IFE123"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("AMS234", Account("Andres Herrera", "IFE123"))
    car2.license= "DF1231"
    car2.driver= "Mauricio Suarez"
    print(vars(car2))