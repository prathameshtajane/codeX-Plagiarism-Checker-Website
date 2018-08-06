package interfaces;

/**
 *  This is an interface which has method(s) to provide functionality to
 *  different types of system users.
 *  All the classes implementing this interface should provide implementation for
 *  all the methods declared in this interface.
 */
public interface User {

    /**
     * This method allows system users to log into the system
     * @param email unique email address of the user
     * @param password user password for given email address
     */
    void LoginUser(String email, String password);

    /**
     * This method allows system users to log out of the system
     * @param userId unique user id for specific user
     */
    void LogOutUser(int userId);
}
