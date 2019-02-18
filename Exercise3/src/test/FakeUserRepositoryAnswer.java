package test;

import exercise3.IRepository;

public class FakeUserRepositoryAnswer implements IRepository {

    public String[] getUserDetails() {
        return new String[]{"firstName", "lastName", "15", "email@gmail.com"};
    }
}
