package Enum;

public enum EnumAnimal{

    // CAT, DOG, FROG

    CAT("Кот"), DOG("Пес"), FROG("Лягушка");

    private String translation;

    EnumAnimal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на RU: " + translation;
    }
}
