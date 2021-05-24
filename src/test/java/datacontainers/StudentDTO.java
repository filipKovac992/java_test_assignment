package datacontainers;

public class StudentDTO {

    private String name;
    private String surname;
    private String accountName;
    private String email;
    private String bankCardNumber;

    public StudentDTO(String name, String surname, String accountName, String email, String bankCardNumber) {
        this.name = name;
        this.surname = surname;
        this.accountName = accountName;
        this.email = email;
        this.bankCardNumber = bankCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }
}
