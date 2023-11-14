public class Command {
    private static final String COMMAND_LIST = """
            Список команд бота:\s
            /help - вывод справки по командам
            /things - вывод записанных вещей
            /addthing - добавить новую вещь
            /delthing - удалить вещь
            """;

    public static void help(){
        System.out.println(COMMAND_LIST);
    }
    public static void deadlines(){
        System.out.println("Ваши записанные вещи: ");
        Main.things.printList();
    }

    public static void addThing(){
        String[] thingAtributes = new String[2];
        for (int i = 0; i < Thing.format.length; i++){
            System.out.println("Укажите " + Thing.format[i]);
            thingAtributes[i] = Console.getString();
        }
        Thing newThing = new Thing(thingAtributes[0], thingAtributes[1]);
        Main.things.add(newThing);
    }

    public static void delThing(){
        System.out.println("Введите номер вещи, которую вы хотите удалить");
        Main.things.printList();
        Main.things.del(Console.getInt());
    }


}