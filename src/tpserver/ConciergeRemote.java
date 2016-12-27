package tpserver;

import java.util.ArrayList;
import javax.ejb.Remote;

@Remote
public interface ConciergeRemote {

    String teste();

    ArrayList<String> seeNews();

    ArrayList<String> seeLastThree();

    void askAccess(String username, String password);

    void askReactivation(String username, String password);

}
