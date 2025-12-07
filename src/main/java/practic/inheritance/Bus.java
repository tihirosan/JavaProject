package practic.inheritance;

public class Bus {
    private double tankFullnessRate; // насколько заполнен топливный бак (от нуля до единицы)
    private final double consumptionRate; // расход топлива на км
    /*
    условно, если бак заполнен на 100% (единица), а расход —
    0,01, бака хватит на 100 км
    */
    private static int count;
    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        count++;
    }
    public boolean run(int distance) { // проезд автобуса на определённое расстояние в километрах
        if (powerReserve() < distance) { // проверяется,хватит ли топлива на проезд этого расстояния
            return false;
        }
        tankFullnessRate-= distance * consumptionRate;
        return true; // из переменной с объёмом топливного бака вычитается путь в километрах, умноженный на
        // расход топлива на 1 км
    }
    public final void refuel(double tankRate) { // заправка автобуса
        double total = tankFullnessRate + tankRate; //насколько заполнен топливный бак плюс количество доливаемого топлива
        tankFullnessRate = total > 1 ? 1 : total; // если попытаться заправить бак больше чем на 100%, он заполнится только до 100%
    }
    public int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate); //на сколько километров хватит оставшегося запаса топлива
    }
    public double getConsumptionRate() { // уровень потребления топлива
        return consumptionRate;
    }
    public double getTankFullnessRate() { // степень наполненности бака
        return tankFullnessRate;
    }
    // метод, который возвращает количество созданных автобусов
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Bus.count = count;
    }
    @Override
    public String toString() {
        return "Bus{" +
                "tankFullnessRate=" + tankFullnessRate +
                ", consumptionRate=" + consumptionRate +
                '}';
    }
}
