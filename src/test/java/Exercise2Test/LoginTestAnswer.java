package Exercise2Test;

import exercise2.Login;
import exercise2.UserValidator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class LoginTestAnswer {
    private Login login;

    @Mock
    UserValidator userValidator;

    @Before
    public void setUp(){
        // this sets up the mock we have declared above
        MockitoAnnotations.initMocks(this);
        // this sets up the class which takes our stub class
        login = new Login(userValidator);

    }

    @Test
    public void LoggedOutUserIsLoggedIn(){
        // arrange - we must set up the test so that the user is 'logged out'
        when(userValidator.userIsLoggedIn()).thenReturn(false);

        // act
        login.logInOrOut();

        // assert - let's test both methods here to be sure
        verify(userValidator, times(0)).logOutUser();
        verify(userValidator, times(1)).logInUser();
    }
    @Test
    public void LoggedInUserIsLoggedOut(){
        // arrange - we must set up the test so that the user is 'logged in'
        when(userValidator.userIsLoggedIn()).thenReturn(true);

        // act
        login.logInOrOut();

        // assert - let's test both methods here to be sure
        verify(userValidator, times(1)).logOutUser();
        verify(userValidator, times(0)).logInUser();
    }

}
