// Бирюков Виктор, задание банкомат должен поплнятся и выдавать купюры
public class Bankomat {
    private int numb20rub;
    private int numb50rub;
    private int numb100rub;

    // Конструктор с тремя параметрами - количеством купюр каждого номинала
    public Bankomat(int numb20rub, int numb50rub, int numb100rub) {
        this.numb20rub = numb20rub;
        this.numb50rub = numb50rub;
        this.numb100rub = numb100rub;
    }

    // Метод для добавления денег в банкомат
    public void addMoney(int numb20rub, int numb50rub, int numb100rub) {
        this.numb20rub += numb20rub;
        this.numb50rub += numb50rub;
        this.numb100rub += numb100rub;
        System.out.println("Деньги добавлены в банкомат.");
    }

    // Функция для снятия денег
    public boolean withdrawMoney(int amount) {
        int totalAmount = amount;

        int num100 = Math.min(totalAmount / 100, numb100rub);
        totalAmount -= num100 * 100;

        int num50 = Math.min(totalAmount / 50, numb50rub);
        totalAmount -= num50 * 50;

        int num20 = Math.min(totalAmount / 20, numb20rub);
        totalAmount -= num20 * 20;

        if (totalAmount == 0) {
            // Если возможно выдать запрошенную сумму, уменьшаем количество купюр и возвращаем true
            numb100rub -= num100;
            numb50rub -= num50;
            numb20rub -= num20;

            System.out.println("Выдано купюр номиналом 100: " + num100);
            System.out.println("Выдано купюр номиналом 50: " + num50);
            System.out.println("Выдано купюр номиналом 20: " + num20);
            return true;
        } else {
            System.out.println("Невозможно выдать запрошенную сумму.");
            return false;
        }
    }

    public static void main(String[] args) {
        // Пример использования
        Bankomat atm = new Bankomat(10, 10, 10); // Создание банкомата с начальным количеством купюр

        // Добавление денег в банкомат
        atm.addMoney(0, 5, 5);

        // Снятие денег
        int withdrawAmount = 450; // Сумма, которую хотим снять
        boolean success = atm.withdrawMoney(withdrawAmount);

        if (success) {
            System.out.println("Операция выполнена успешно.");
        } else {
            System.out.println("Операция не выполнена.");
        }
    }
}