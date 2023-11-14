public class Main {
    final static ThingList things = new ThingList();
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в бота для записи местонахождения вещей в доме." +
                           "Что-бы узнать о возможностях бота, используйте команду /help ");
        while(true){
            System.out.println("Чем могу помочь?");
            String answer = Console.getString();
            switch (answer){
                case "/help" -> Command.help();
                case "/things" -> Command.deadlines();
                case "/addthing" -> Command.addThing();
                case "/delthing" -> Command.delThing();
                default -> System.out.println("Я не знаю такой команды");
            }
        }
    }
}