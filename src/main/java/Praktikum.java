public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        String correctAccount = "Тимоти Шаламе";
        Account checkCorrectAccount = new Account(correctAccount);
        checkCorrectAccount.checkNameToEmboss();

        String incorrectAccount = " ТимотейШевроле   ";
        Account checkIncorrectAccount = new Account(incorrectAccount);
        checkIncorrectAccount.checkNameToEmboss();

        //вызов метода с корректным именем - true
        //вызов метода с некорректным именем - false

    }

}
