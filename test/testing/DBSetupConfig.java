package testing;


import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;

/**
 *
 * @author Philip
 */
public class DBSetupConfig {
    public void executeOperation(Operation operation) {
        DbSetup dbSetup = new DbSetup(new DriverManagerDestination(
                "jdbc:mysql://localhost:3306/bookbus", 
                "root", 
                ""), operation);
        dbSetup.launch();
    }
}
