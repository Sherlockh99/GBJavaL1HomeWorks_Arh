package lesson7;

public class Cat {
    private String name;
    private int appetite;
    //private boolean isHungry;
    private boolean satiety;

    /*
    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
*/

    public boolean isSatiety() {
        return satiety;
    }

    public Cat(String name) {
        this.name = name;
        this.appetite = 5;
        //this.isHungry = true;
        this.satiety = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("Name: " + name + ", satiety: " + satiety);
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(appetite)){
            //isHungry = false;
            satiety = true;
            System.out.println(name + " поел из тарелки");
        }else{
            /*
            isHungry = true;
            satiety =false;
            */
            System.out.println(name + " не хватает еды в тарелке");
        };
    }

    public static void Satiety(Cat[] cats){
        for (int i = 0; i <cats.length ; i++) {
            if(cats[i].isSatiety()){
                System.out.println(cats[i].getName() + " сыт");
            }else {
                System.out.println(cats[i].getName() + " голоден");
            }
        }
    }
}
