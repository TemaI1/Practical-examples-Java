package JavaPractical.ListToys;

public abstract class creatingToys {
    public int id;
    public String name;
    public float weight;
    public String type;
    public String material;

    public creatingToys(int id,String name, float weight, String type, String material){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.material = material;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nНазвание: " + name + "\nВес: " + weight + "\nТип: " + type + "\nМатериал: " + material;
    }

}
