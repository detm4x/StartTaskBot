public class Thing {
    private String name;
    private String place;
    final static String[] format = new String[]{"название", "где находится"};

    public Thing(String name, String place){
        this.name = name; 
        this.place = "находится в " + place;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPlace(String place) {
        this.place = place;
    }

    public void print(){
        System.out.print(name + "\t");
        System.out.print(place + "\t");
    }
}