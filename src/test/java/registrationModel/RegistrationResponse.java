package registrationModel;

import java.math.BigDecimal;

public class RegistrationResponse {
    PositiveResponse positiveResponse;
    NegativeResponse negativeResponse;
    Address address;

    String email;
    BigDecimal phone;
    String pwd;
    BigDecimal birthDate;
    String description;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getPhone() {
        return phone;
    }

    public void setPhone(BigDecimal phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public BigDecimal getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(BigDecimal birthDate) {
        this.birthDate = birthDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PositiveResponse getPositiveResponse() {
        return positiveResponse;
    }

    public void setPositiveResponse(PositiveResponse positiveResponse) {
        this.positiveResponse = positiveResponse;
    }

    public NegativeResponse getNegativeResponse() {
        return negativeResponse;
    }

    public void setNegativeResponse(NegativeResponse negativeResponse) {
        this.negativeResponse = negativeResponse;
    }
}
