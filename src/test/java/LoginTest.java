import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    Login login = new Login();

    @Test
    public void testUsernameCorrect() {
        assertTrue(login.checkUserName("Kyl_1"));
    }

    @Test
    public void testUsernameIncorrect() {
        assertFalse(login.checkUserName("Kyle!!!!!!!"));
    }

    @Test
    public void testPasswordCorrect() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordIncorrect() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testPhoneCorrect() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testPhoneIncorrect() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testLoginSuccess() {
        login.registerUser("Kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertTrue(login.loginUser("Kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testLoginFail() {
        login.registerUser("Kyl_1", "Ch&&sec@ke99!", "+27838968976");
        assertFalse(login.loginUser("wrong", "wrong"));
    }
}