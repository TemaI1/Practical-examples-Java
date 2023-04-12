package JavaPractical2.AnimalTraining;

public class ListTrainig {
    public int id;
    public String nameInstruction;
    public String schoolTime;
    public String levelTraining;

    public ListTrainig(int id, String nameInstruction, String schoolTime, String levelTraining){
        this.id = id;
        this.nameInstruction = nameInstruction;
        this.schoolTime = schoolTime;
        this.levelTraining = levelTraining;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nname instruction: " + nameInstruction + "\nschool time: " + schoolTime + "\nlevel training: " + levelTraining;
    }
}
