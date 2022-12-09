package Interfaces;

public class Animals implements BaseInterfaces{
    public int id;

    public Animals(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("ID is " + this.id);
    }

}
