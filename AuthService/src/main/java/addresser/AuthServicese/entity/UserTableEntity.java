package addresser.AuthServicese.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "users")
@Entity
@Data
public class UserTableEntity {
    @Id
    public int id;
    public String name;
    public String accesstoken;
    public String password;
    public String mailaddress;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAccesstoken() {
//        return accesstoken;
//    }
//
//    public void setAccesstoken(String accesstoken) {
//        this.accesstoken = accesstoken;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
