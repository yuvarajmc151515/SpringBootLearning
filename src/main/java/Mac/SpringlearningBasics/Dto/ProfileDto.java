package Mac.SpringlearningBasics.Dto;

public class ProfileDto {

    private String email;
    private String mobileNo;

    public ProfileDto() {

    }

    ProfileDto(String email, String mobileNo) {
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
