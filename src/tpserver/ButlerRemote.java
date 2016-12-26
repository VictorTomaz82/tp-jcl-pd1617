package tpserver;

import java.util.Date;
import javax.ejb.Remote;

@Remote
public interface ButlerRemote {
    
    //only "true" function of buttler
    public void login(String username, String password);

    public String seeNews();

    public String seeLastThree();

    public void askAccess(String username, String password, String confirmPassword);

    public void askReactivation(String username, String password);

    public void changePassword(String username, String password, String confirmPassword);

    public void messageUser(String senderId, String recipientId, String title, String body, Date time);

    public void doSale(String name, String description, String sellerId, int startPrice);

    public void follow(String itemId);

    public void doBid(String itemId);

    public void denunce(String userId, String itemId, String motive);

    public void addBalance(int money);

    public void payItem(String itemId);

    public void askSuspension(String userId, String motive);

    public void unactivate(String userId);

    public void suspendUser(String userId, String motive);

    public void reactivateUser(String userId);

    public void seeUser(String userId);

    public void seeItem(String itemId);

    public void addCategory(String name, String description);

    public void changeCategory(String name, String newName, String description);

    //----debug only (begin)----
    public String teste();
    //----debug only (end)----

}
