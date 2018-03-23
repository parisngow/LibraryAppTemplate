/**
 * Address Class
 */
public class Address {
    
    String street;
    String city;
    String province;
    String postalCode;
    
     /**
     * toString() : void
     * Overrides the default toString() method.
     * This will format the address in the form of
     *
     * street
     * city, province
     * postalCode
     *
     * @return
     *          String consisting of a formatted mailing address.
     */
    public String toString(){
        String address = street + "\n" + city + ", " + province + "\n" + postalCode;
        return address;
    }
}
