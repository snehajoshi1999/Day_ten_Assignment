package com.brizlabs.Assi9;


public class AdressBook {
	public static void main(String[] args) {
		
	
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    Address adress;

		



	private String lastName;
	private String address;
	private String city;
	private String email;
	private String state;
	private Address adress;
	private String firstName;    public String getFirstName() {
        return firstName;
    }
	

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return getAddress();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return getCity();
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return getEmail();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAdress() {
        return getAdress();
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "AdressBook{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                '}';
    }
}

class Address {
    int zip;
    long phoneNumber;

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}