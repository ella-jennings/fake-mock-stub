package Exercise3Test;


import exercise3.UserInfoGenerator;
import org.junit.Assert;
import org.junit.Test;

public class UserInfoTestsAnswer {
    @Test
    public void CallingGetInfoAsString_ReturnsTheCorrectString(){
        // ARRANGE
        // this time we don't have to set up a mock
        FakeUserRepositoryAnswer fakeUserRepository = new FakeUserRepositoryAnswer();
        // we still have to inject the fake in as a dependency
        UserInfoGenerator userInfoGenerator = new UserInfoGenerator(fakeUserRepository);

        // ACT
        String result = userInfoGenerator.GetUserInfoAsString();

        // ASSERT
        // your assertion will depend on what your fakeRepository returns
        String expectedString = "firstName | lastName | 15 | email@gmail.com";
        Assert.assertEquals(result, expectedString);
    }
}
