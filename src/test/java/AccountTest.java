import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;

public AccountTest(String name, boolean expected) {
    this.name = name;
    this.expected = expected;
}

    @Parameterized.Parameters(name = "Имя: {0}, можно напечатать на карте - результат: {1}")
    public static Object[][] checkNameToEmboss() {
        return new Object[][]{
                {"Тимоти Шаламе", true}, //Корректное имя - 1 пробел - 13 символов
                {"ТимотейШевроле", false}, //меньше 1 пробела между словами
                {"Тимоти  Шаламе", false}, //больше одного пробела между словами
                {" Тимоти Шаламе  ", true}, //пробелы в начале и в конце строки
//                {"Т ", false}, //2 символа  ИЗБЫТОЧНЫЙ ТЕСТ Т.К. ЭТО ЖЕ ПРОВЕРЯЕТ ТЕСТ, ГДЕ МЕНЬШЕ 1 ПРОБЕЛА МЕЖДУ СЛОВАМИ
                {"Т Ш", true}, //3 символа
                {"Тимоти ШаламеББББББ", true}, //19 символов
                {"Тимоти ШаламеБББББББ", false}, //20 символов
                {"", false}, //пустая строка
                {null, false}, //null

        };
    }

    @Test
    public void checkName() {
    Account account = new Account(name);
    boolean actual = account.checkNameToEmboss();
    assertEquals(actual, expected);
    }

}
