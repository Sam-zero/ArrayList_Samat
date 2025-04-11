public class MyArrayListTest {
    public static void main(String[] args) {

        System.out.println("--- MyArrayList<String> Test ---");
        MyArrayList<String> stringList = new MyArrayList<>();

        stringList.add("alma");
        stringList.add("banan");
        stringList.add("almurt");
        System.out.print("Initial list: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        stringList.add(1, "shabdaly");
        System.out.print("List after adding 'shabdaly' at index 1: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();
        stringList.remove(2);
        System.out.print("List after removing element at index 2: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        stringList.addFirst("shie");
        stringList.addLast("qulpynay");
        System.out.print("List after addFirst and addLast: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        stringList.set(1, "qarbyz");
        System.out.print("List after setting index 1 to 'qarbyz': ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Current size: " + stringList.size());

        System.out.println("Index of 'qarbyz': " + stringList.indexOf("qarbyz"));
        System.out.println("Index of 'zhuzim': " + stringList.indexOf("zhuzim"));

        System.out.print("List before sorting: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();
        stringList.sort();
        System.out.print("List after sorting: ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();

        stringList.clear();
        System.out.print("List after clear(): ");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Size after clear(): " + stringList.size());
    }
}