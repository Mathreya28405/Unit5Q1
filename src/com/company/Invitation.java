package com.company;

public class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a)
    {
        hostName = n;
        address = a;
    }

    public Invitation(String originalAddress) {
        address = originalAddress;
        hostName = "Host";
    }

    public String getName() {
        return hostName;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public String formalInvite(String invited) {
        String e = "Dear " + invited + ", ";
        String f = "please attend my event at " + address + ".";
        String g = "See you then, " + hostName + ".";
        String h = e + f + g;
        return h;
    }


    public static void main(String[] args) {
	    Invitation party = new Invitation("Karen", "1234 Walnut Street");
	    System.out.println(party.formalInvite("Cheryl"));
	    Invitation dinner = new Invitation("215 Salem Road");
	    System.out.println(dinner.formalInvite("Ashley"));
    }

}
/*
Output for main:
Dear Cheryl, please attend my event at 1234 Walnut Street.See you then, Karen.
Dear Ashley, please attend my event at 215 Salem Road.See you then, Host.
 */
