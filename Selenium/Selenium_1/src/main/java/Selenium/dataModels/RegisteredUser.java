package Selenium.dataModels;
import Selenium.generators.CredentialsGenerator;

public class RegisteredUser extends UserBase{

    private String password;

    public RegisteredUser(){
        this.isRegistred = true;
        this.password = CredentialsGenerator.generatePassword();
        dataModels.Address add = new dataModels.Address(true);
        this.setAddress(add);
        this.setShippingAddress(add);
    }

    public RegisteredUser(boolean withAlternativeShippingAddress){
        if (withAlternativeShippingAddress){
            this.isRegistred = true;
            this.password = CredentialsGenerator.generatePassword();
            this.setAddress(new dataModels.Address(true));
            this.setShippingAddress(new dataModels.Address(true));
        } else {
            new RegisteredUser();
        }
    }

}
