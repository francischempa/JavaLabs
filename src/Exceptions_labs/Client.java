package Exceptions_labs;

import objects_and_classes.Trade;

public class Client {
    private String firstName;
    private String lastName;

    private MembershipType memberType;

    public String getFirstName() {
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


    public MembershipType getMemberType() {
        return memberType;
    }

    public void setMemberType(MembershipType memberType) {
        this.memberType = memberType;
    }

    public void addTrade(Trade t){

    }

    public Boolean canTrade(){
        return Boolean.FALSE;
    }
}
