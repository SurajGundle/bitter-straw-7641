package src.main.java.bean;

public class User {

    private int userId;
    private String password;
    private String role;
    private String mobile;
    private String email;
    private String city;

    public User() {
    }

    public User(int userId, String password, String role, String mobile, String email, String city) {
        this.userId = userId;
        this.password = password;
        this.role = role;
        this.mobile = mobile;
        this.email = email;
        this.city = city;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
