import java.util.*;

class Program {
  public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
    if (arrayOne.size() == 0 && arrayTwo.size() == 0) {
      return true;
    }

    if (arrayOne.size() != arrayTwo.size() || !arrayOne.get(0).equals(arrayTwo.get(0))) {
      return false;
    }

    arrayOne = new ArrayList<>(arrayOne);
    arrayTwo = new ArrayList<>(arrayTwo);

    int root = arrayOne.get(0);
    arrayOne.remove(0);
    arrayTwo.remove(0);

    List<Integer> leftOne = new LinkedList<>();
    List<Integer> rightOne = new LinkedList<>();

    for (int i : arrayOne) {
      if (i >= root) {
        rightOne.add(i);
      } else {
        leftOne.add(i);
      }
    }

    List<Integer> leftTwo = new LinkedList<>();
    List<Integer> rightTwo = new LinkedList<>();

    for (int i : arrayTwo) {
      if (i >= root) {
        rightTwo.add(i);
      } else {
        leftTwo.add(i);
      }
    }

    return sameBsts(leftOne, leftTwo) && sameBsts(rightOne, rightTwo);
  }

  public static void main(String[] args) {
    Integer[] a1 = new Integer[] { 10, 15, 8, 12, 94, 81, 5, 2, -1, 101, 45, 12, 8, -1, 8, 2, -34 };
    Integer[] a2 = new Integer[] { 10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 8, 12, 45, 100 };
    List<Integer> arrayOne = Arrays.asList(a1);
    List<Integer> arrayTwo = Arrays.asList(a2);
    // System.out.println(Program.sameBsts(arrayOne, arrayTwo)); //false

    Integer[] a3 = new Integer[] {50, 76, 81, 23, 23, 23, 657, 56, 12, -1, 3};
    Integer[] a4 = new Integer[] {50, 23, 76, 23, 23, 12, 56, 81, -1, 3, 657};
    List<Integer> arrayThree = Arrays.asList(a3);
    List<Integer> arrayFour = Arrays.asList(a4);
    System.out.println(Program.sameBsts(arrayThree, arrayFour)); //false
  }
}
