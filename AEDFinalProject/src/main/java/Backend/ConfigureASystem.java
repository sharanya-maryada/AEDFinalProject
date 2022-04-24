package Backend;
import Backend.Employee.Employee;
import Backend.Role.SystemAdminRole;
import Backend.UserAccount.UserAccount;
import java.util.Date;
/**
 *
 * @author ap
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        return system;
    }
}