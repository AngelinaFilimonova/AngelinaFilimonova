package AQA.Java.FirstTask;

public class Kotik {
    private String nameCat;
    private double weight;
    private int sytost;

    public Kotik(String nameCat, double weight, int sytost) {
        this.nameCat = nameCat;
        this.weight = weight;
        this.sytost = sytost;
    }

    public Kotik() {
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSytost() {
        return sytost;
    }

    public void setSytost(int sytost) {
        this.sytost = sytost;
    }

    public void play(){
        System.out.println("Котик хочет поиграть");
    }

    public void sleep(){
        System.out.println("Котик хочет поспать");
    }

    public void chaseMouse(){
        System.out.println("Котик ловит мышку");
    }

    public void say(){
        System.out.println("meow");
    }


    public void eat(){
        if (getSytost() <= 0){
            System.out.println("Котик хочет кушать, МЯУ");
        }
    }

    public void liveAnotherDay(){
        for (int i=0; i<=24; i++){
            int metod = 0;
            switch (metod){
                case 1: play();
                    break;
                case 2: sleep();
                    break;
                case 3: chaseMouse();
                    break;
                case 4: say();
                    break;
                default: eat();
            }
            System.out.println(Math.random()*5 + 1);
        }
    }

}
