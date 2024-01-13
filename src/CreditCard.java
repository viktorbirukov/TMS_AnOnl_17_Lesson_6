public class CreditCard {
    private String accountNumber;
    private double currentBalance;

    // Конструктор с параметрами
    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = initialBalance;
    }

    // Метод для начисления суммы на кредитную карту
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Депозит: Руб." + amount);
        } else {
            System.out.println("Депозита нет");
        }
    }

    // Метод для снятия суммы с кредитной карты
    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Снять: Руб." + amount);
        } else {
            System.out.println("Нельзя снять");
        }
    }

    // Метод для вывода текущей информации о карточке
    public void printCardInfo() {
        System.out.println("Номер карты: " + accountNumber);
        System.out.println("Баланс карты: Руб." + currentBalance);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        // Создание трех объектов класса CreditCard
        CreditCard card1 = new CreditCard("1234-5678-9012-3456", 23231.0);
        CreditCard card2 = new CreditCard("9876-5432-1098-7654", 5856.0);
        CreditCard card3 = new CreditCard("1111-2222-3333-4444", 6734.0);

        // Положить деньги на первые две карточки
        card1.deposit(45200.0);
        card2.deposit(450300.0);

        // Снять сумму с третьей карточки
        card3.withdraw(1167.0);

        // Вывести на экран текущее состояние всех трех карточек
        System.out.println("Информация о кредитных картах:");
        card1.printCardInfo();
        card2.printCardInfo();
        card3.printCardInfo();
    }
}