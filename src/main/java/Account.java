import org.apache.commons.lang3.StringUtils;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        if (name == null) {
            return false;
        }
//        String nameTrim = name.trim();
        int occurrence = StringUtils.countMatches(name, " ");

        if (name.length() >= 3 && name.length() <= 19 && occurrence == 1 && !name.startsWith(" ") && !name.endsWith(" ")) {

            System.out.println("Имя введено корректно - его можно напечатать на карте.");
            return true;
        } else{
            System.out.println("Имя введено некорректно - его нельзя напечатать на карте.");
            return false;
        }

    }

}
