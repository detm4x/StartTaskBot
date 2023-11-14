import java.util.LinkedList;
public class ThingList {
    LinkedList<Thing> list = new LinkedList<>();
    public void printList(){
        for (int i = 0; i < list.size(); i++){
            System.out.print(i+1 + ". ");
            list.get(i).print();
            System.out.println();
        }
    }
    public void add(Thing object){
        list.add(object);
        System.out.println("Вещь добавлена");
    }
    public void del(int num){
        if (num < 0 || num > list.size()){
            System.out.println("Некорректный номер");
        }
        else {
            list.remove(num - 1);
            System.out.println("Вещь удалена");
        }
    }
}