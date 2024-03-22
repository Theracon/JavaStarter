public class Main {
    public static void main (String[] args) {
        DynamicArray dArr = new DynamicArray();
        
        boolean isEmptyStart = dArr.isEmpty();
        System.out.println("Empty: " + isEmptyStart);

        dArr.add("1");
        dArr.add("3");
        dArr.add("4");

        boolean isEmptyNow = dArr.isEmpty();
        System.out.println("Empty: " + isEmptyNow);

        System.out.println(dArr);

        dArr.insert("5");
        System.out.println(dArr);

        dArr.insert("2", 1);
        System.out.println(dArr);

        boolean containsOne = dArr.contains("1");
        System.out.println("Contains 1: " + containsOne);

        boolean containsSix = dArr.contains("6");
        System.out.println("Contains 6: " + containsSix);

        int indexOfOne = dArr.indexOf("1");
        System.out.println("Index of 1: " + indexOfOne);

        int indexOfSix = dArr.indexOf("6");
        System.out.println("Index of 6: " + indexOfSix);

        boolean deletedThree = dArr.delete("3");
        System.out.println("Deleted 3: " + deletedThree);

        boolean deletedTen = dArr.delete("10");
        System.out.println("Deleted 10: " + deletedTen);

        System.out.println(dArr);

        dArr.add("6");
        dArr.add("7");
        dArr.add("8");
        dArr.add("9");
        dArr.add("10");
        dArr.add("11");
        dArr.add("12");


        System.out.println(dArr);

        dArr.delete("4");
        dArr.delete("5");
        dArr.delete("6");
        dArr.delete("7");
        dArr.delete("8");
        dArr.delete("9");
        dArr.delete("10");
        dArr.delete("11");

        System.out.println(dArr);
    }
}