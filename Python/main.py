from car import Car
if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "AMS123"
    car.driver = "Andres Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "LJH123"
    car2.driver = "Martha Vite"
    print(vars(car2))