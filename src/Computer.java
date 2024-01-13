public class Computer {
    private double cost;
    private String model;
    private RAM ram;
    private HDD hdd;

    // Конструктор с параметрами

    public Computer(double cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    // Вложенный класс для описания RAM

    public static class RAM {
        private String name;
        private int size;

        // Конструктор по умолчанию

        public RAM() {
        }

        // Конструктор со всеми параметрами

        public RAM(String name, int size) {
            this.name = name;
            this.size = size;
        }
    }

    // Вложенный класс для описания HDD

    public static class HDD {
        private String name;
        private int size;
        private String type; // Внутренний или внешний

        // Конструктор по умолчанию

        public HDD() {
        }

        // Конструктор со всеми параметрами

        public HDD(String name, int size, String type) {
            this.name = name;
            this.size = size;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        // Пример использования класса Computer

        RAM computerRAM = new RAM("Comp", 8);
        HDD computerHDD = new HDD("Comp1", 1000, "Comp2");

        Computer myComputer = new Computer(800.0, "Lenovo", computerRAM, computerHDD);

        // Вывод информации о компьютере

        System.out.println("Модель: " + myComputer.model);
        System.out.println("Цена: $" + myComputer.cost);
        System.out.println("RAM: " + myComputer.ram.name + " " + myComputer.ram.size + "GB");
        System.out.println("HDD: " + myComputer.hdd.name + " " + myComputer.hdd.size + "GB (" + myComputer.hdd.type + ")");
    }
}