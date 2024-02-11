public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i : list){
            System.out.println(i);
        }
    }
}