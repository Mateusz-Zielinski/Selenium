package Selenium.dataModels;

import Selenium.generators.AddressGenerator;
import Selenium.generators.CredentialsGenerator;

public class UserBase {

    private String firstname;
    private String lastname;
    private dataModels.Address address;
    private dataModels.Address shippingAddress;
    private String email;
    protected boolean isRegistred;


    protected UserBase(){
        this.firstname = CredentialsGenerator.generateFirstname();
        this.lastname = CredentialsGenerator.generateLastname();
        this.address = new dataModels.Address(false);
        this.shippingAddress = this.address;
        this.email = CredentialsGenerator.generateEmail();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public dataModels.Address getAddress() {
        return address;
    }

    public void setAddress(dataModels.Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public dataModels.Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(dataModels.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
