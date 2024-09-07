public class Pair <T,K>{
    T firstObj;
    K secondObj;
    public Pair(T first, K second) {
        this.firstObj = first;
        this.secondObj = second;
    }
    public T getFirstObj() {
        return firstObj;
    }
    public K getSecondObj() {
        return secondObj;
    }

    @Override
    public String toString() {
        return  "Пара элементов: '" + firstObj + "', '" + secondObj + "'";
    }
}
