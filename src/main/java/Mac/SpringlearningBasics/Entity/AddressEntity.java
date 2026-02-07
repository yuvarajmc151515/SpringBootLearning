package Mac.SpringlearningBasics.Entity;

import Mac.SpringlearningBasics.Dto.AddressDto;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private long addressId;
    private String city;
    private String state;

    public AddressEntity() {
    }

    public AddressEntity(long addressId, String city, String state) {
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
