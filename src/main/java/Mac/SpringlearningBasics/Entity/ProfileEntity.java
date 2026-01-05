package Mac.SpringlearningBasics.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profile")
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id")
    private int profileId;

    private String email;

    @Column(name = "mobile_no")
    private String mobileNo;

    public ProfileEntity() {

    }

     public ProfileEntity(String email, String mobileNo) {
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
