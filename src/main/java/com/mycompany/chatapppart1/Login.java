public class Login {

    private String username;
    private String password;
    private String cellPhoneNumber;

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
        return password.matches(regex);
    }

    public boolean checkCellPhoneNumber(String number) {
        String regex = "^\\+27[0-9]{9}$";
        return number.matches(regex);
    }

    public String registerUser(String username, String password, String number) {

        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber(number)) {
            return "Cell phone number is incorrectly formatted or does not contain international code.";
        }

        this.username = username;
        this.password = password;
        this.cellPhoneNumber = number;

        return "User successfully registered.";
    }

    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome user, it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}