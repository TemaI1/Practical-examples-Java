package Exceptions.FinalWork;

public class MayException {

    protected void emptyString(String meaning) throws Exception{
        if (meaning == null || meaning.isEmpty() || meaning.equals(" ")) {
            System.out.println("Ваша запись записана, но не в полном формате!");
            throw new Exception("Ваша строка пуста!");
        }
    }

    protected void numberCharacters(String meaning, int symbol) throws Exception{
        if (meaning.length() != symbol) {
            System.out.println("Ваша запись записана, но не в полном формате!");
            throw new Exception("Неверное количество символов!");
        }
    }

    protected void longLine(String meaning) throws Exception{
        if (meaning.length() > 50) {
            System.out.println("Ваша запись записана, но она пуста!");
            throw new Exception("Ваше значение превышает допустимое!");
        }
    }

    protected void incorrectCharacter(String meaning) throws Exception{
        char symbol = meaning.charAt(0);
        if (symbol != 'f' && symbol != 'm') {
            System.out.println("Ваша запись записана, но не в полном формате!");
            throw new Exception("Неверно указан символ!");
        }
    }

    protected void pointMissing(String meaning) throws Exception{
        if(meaning.contains(".") == false) {
            System.out.println("Ваша запись записана, но не в полном формате!");
            throw new Exception("Разделение точкой отсутствует!");
        }
    }

    protected void invalidFormat(String meaning) throws Exception{
        try {  
            Long.parseLong(meaning);
        } catch(Exception e){
            System.out.println("Ваша запись записана, но не в полном формате!");
            throw new Exception("Необходимо числовое значение!");
        }  
    }

}
