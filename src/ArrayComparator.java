public class ArrayComparator {
    public <T> boolean compareArrays(T[] array_1, T[] array_2) {
        if (array_1 == null || array_2 == null)
            return false;
        if (array_1.length != array_2.length) {
            return false;
        }
        for (int i = 0; i < array_1.length; i++) {
            if (!array_1[i].equals(array_2[i])) {
                return false;
            }
        }
        return true;
    }
}
