package WildcardsGenerics;

public class Animals {
    private int id;

    Animals (){

    }

    Animals (int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return String.valueOf(this.id); // return this.id + "";
    }
}
