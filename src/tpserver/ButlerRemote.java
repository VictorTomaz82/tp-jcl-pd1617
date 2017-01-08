package tpserver;

import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Remote;

@Remote
public interface ButlerRemote {

    public ArrayList<String> login(String username, String password);
    public ArrayList<String> logout();

    public String getCurrentUsername();

    // these functions will call upon the usertype for user previleges
    public ArrayList<String> seeNews();

    public ArrayList<String> seeLastThree();

    public ArrayList<String> askAccess(String username, String password, String name, String address);

    public ArrayList<String> askReactivation(String username, String password);

    public ArrayList<String> changePassword(String username, String password, String newPassword, String confirmPassword);
    
    public ArrayList<String> changeUserInformation(String name,String address);
    
    public ArrayList<String> viewMessageList();
    
    public ArrayList<String> viewMessage(String messageId);

    public ArrayList<String> messageUser(String senderUsername, String recipientUsername, String title, String body, Date time);

    public ArrayList<String> doSale(String sellerUsername, String itemName, String categoryName, String description, int startPrice, int buyout, Date endTime);
    
    public ArrayList<String> viewUserItemsList();
    
    public ArrayList<String> viewSellingItemList();
    
    public ArrayList<String> viewBiddedItemList();
    
    public ArrayList<String> viewWonItemList();
    
    public ArrayList<String> viewFollowedItemList();
    
    public ArrayList<String> follow(String itemId);

    public ArrayList<String> doBid(String itemId, int bid);

    public ArrayList<String> denunceItem(String itemId, String motive);

    public ArrayList<String> denunceUser(String username, String motive);
    
    public ArrayList<String> viewUserBalance();

    public ArrayList<String> addBalance(String username, int money);

    public ArrayList<String> payItem(String itemId);

    public ArrayList<String> askSuspension(String username, String motive);

    public ArrayList<String> viewDenunceList();
    
    public ArrayList<String> suspendUser(String username, String motive);
    
    public ArrayList<String> itemRemove(String itemId);

    public ArrayList<String> reactivateUser(String username);
    
    public ArrayList<String> viewUserList(); 

    public ArrayList<String> seeUser(String username);
    
    public ArrayList<String> viewItemList();

    public ArrayList<String> seeItem(String itemId);
    
    public ArrayList<String> viewCategoryList();

    public ArrayList<String> addCategory(String name, String description);

    public ArrayList<String> changeCategory(String name, String newName, String description);

}
