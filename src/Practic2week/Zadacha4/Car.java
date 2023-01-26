package Practic2week.Zadacha4;

public class Car {
    public String carModel;

    public Car(String carModel) {
        System.out.println("\n** carModel is " + carModel + " **");
        this.carModel = carModel;
    }
    public class Engine {
        boolean isWorking = false;
        int horsePower;
        Engine (int horsePower) {
            System.out.println("\n** this horseP " + horsePower + " **");
            if (horsePower > 0) this.horsePower = horsePower;
        }

        public String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }

}
