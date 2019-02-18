package exercise3;

public class UserInfoGenerator {

    private IRepository repository;

    // IMPORTANT - this takes an implementation of the interface, not the class itself
    public UserInfoGenerator(IRepository repository) {
        this.repository = repository;
    }

    public String GetUserInfoAsString(){
        String[] userDetails = repository.getUserDetails();
        StringBuilder stringBuilder = new StringBuilder();

        int sizeOfArray =  userDetails.length;
        int lastIndexOfArray = sizeOfArray - 1;

        for(int i = 0; i < sizeOfArray; i++){
            stringBuilder.append(userDetails[i]);
            if(i != lastIndexOfArray){
                stringBuilder.append(" | ");
            }
        }
        return stringBuilder.toString();
    }
}
