package sw.angular.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String user_name;
    private String password;
    private String email;
    private String bank_account;
    private String address;
    private String type;



    public User(String user_name, String password, String email, String Bank_account,  String Address,  String type) {
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.bank_account = Bank_account;
        this.address = Address;
        this.type = type;
    }

    public User() {
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String Bank_account) {
        this.bank_account = Bank_account;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        address = Address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
