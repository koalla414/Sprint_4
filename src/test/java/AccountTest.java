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
                {"Тимоти Шаламе", true},
                {" ТимотейШевроле   ", false},
        };
    }

    @Test
    public void chekName() {
    Account account = new Account(name);
    boolean actual = account.checkNameToEmboss();
    assertEquals(actual, expected);
    }

}
