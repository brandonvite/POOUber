from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("AMS234", Account("Brandon Vite", "VIDB931013"))
    print(vars(car))
    print(vars(car.driver))