import java.util.ArrayList;
import java.util.Stack;
import java.util.UUID;

public class Spotify extends PremiumList {
    private String userName;
    private String PremiumOrBasic;
    private UUID id;

    public Spotify(String userName, String premiumOrBasic) {
        this.userName = userName;
        this.PremiumOrBasic = premiumOrBasic;
        this.id = UUID.randomUUID();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPremiumOrBasic() {
        return PremiumOrBasic;
    }

    public void setPremiumOrBasic(String premiumOrBasic) {
        PremiumOrBasic = premiumOrBasic;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Spotify{" +
                "userName='" + userName + '\'' +
                ", PremiumOrBasic='" + PremiumOrBasic + '\'' +
                ", id=" + id +
                '}';
    }
}
