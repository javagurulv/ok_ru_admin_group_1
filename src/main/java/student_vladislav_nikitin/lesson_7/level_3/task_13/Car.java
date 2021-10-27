package student_vladislav_nikitin.lesson_7.level_3.task_13;

abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    public void accelerate() {
        System.out.println("shhh");
    }

}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    public void accelerate() {
        System.out.println("Vrrrruuum");
    }

}