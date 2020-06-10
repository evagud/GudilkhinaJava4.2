public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.65, 70);
        System.out.printf("Индекс массы тела = %.2f %n", bmi);
        System.out.println("Пониженный вес: менее 18,5 (Вам надо лучше питаться)");
        System.out.println("Нормальный: между 18,5 и 24,9 (Нет оснований для беспокойства)");
        System.out.println("Избыточный вес: между 25 и 29,9 (Существует риск для здоровья)");
        System.out.println("Ожирение: 30 или больше (Сильный риск для здоровья)");

        }
    }

