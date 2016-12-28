package tpserver;

import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Remote;

@Remote
public interface ButlerRemote {
    
    public ArrayList<String> login(String username, String password);
    
    public String getCurrentUsername();
    
    // these functions will call upon the usertype for user previleges
    public ArrayList<String> seeNews();

    public ArrayList<String> seeLastThree();

    public ArrayList<String> askAccess(String username, String password);

    public ArrayList<String> askReactivation(String username, String password);

    public ArrayList<String> changePassword(String username, String password, String newPassword, String confirmPassword);

    public ArrayList<String> messageUser(String senderId, String recipientId, String title, String body, Date time);

    public ArrayList<String> doSale(String sellerUsername, String itemName, String description, int startPrice, int buyout);

    public ArrayList<String> follow(String itemId);

    public ArrayList<String> doBid(String itemId, int bid);

    public ArrayList<String> denunceItem(String itemId, String motive);
    
    public ArrayList<String> denunceUser(String username, String motive);

    public ArrayList<String> addBalance(String username, int money);

    public ArrayList<String> payItem(String itemId);

    public ArrayList<String> askSuspension(String username, String motive);

//    public ArrayList<String> unactivate(String userId);

    public ArrayList<String> suspendUser(String username, String motive);

    public ArrayList<String> reactivateUser(String username);

    public ArrayList<String> seeUser(String username);

    public ArrayList<String> seeItem(String itemId);

    public ArrayList<String> addCategory(String name, String description);

    public ArrayList<String> changeCategory(String name, String newName, String description);

    //---debug only (begin)---
//    public String teste();
    //---debug only (end)---

}
