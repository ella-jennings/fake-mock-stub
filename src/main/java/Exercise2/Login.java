package Exercise2;

public class Login {
    private UserValidator userValidator;

    public Login(UserValidator userValidator) {

        this.userValidator = userValidator;
    }

    public void logInOrOut() {
        if(userValidator.userIsLoggedIn()){
            userValidator.logOutUser();
        } else {
            userValidator.logInUser();
        }
    }
}
