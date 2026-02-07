package Mac.SpringlearningBasics.Dto;

public class AddressDto {

    private long addressId;
    private String city;
    private String state;

    public AddressDto (){

    }

    public AddressDto(long addressId, String city, String state) {
        this.addressId = addressId;
        this.city = city;
        this.state = state;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
