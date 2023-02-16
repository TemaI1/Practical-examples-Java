## Задание:

Необходимо написать проект, для розыгрыша в магазине игрушек.

## Решение:

Работа в Linux представлена в файле Practical.md

Работа с приложением представлена в директории JavaPractical:

    директория ListToys содержит список игрушек наследуемых от creatingToys

    файл MayMethods.java содержит методы:
    - allExistingToys() создает экземпляры класса игрушек и выводит их содержимое при помощи переопределнного toString
    - choiceToy() запрашивает у пользователя необходимый id интересующей его игрушки, выводит название выбраной игрушки 
    - guessNumber() создает рандомное число, которое должен угадать пользователь, в случае неудачи выдаст оповещение или выбросит необработанную ошибку, в случае успеха пользователь должен указать свои данные, после чего он будет записан в файл winners.txt

    файл launchingProgram.java служит исполняемым файлом
