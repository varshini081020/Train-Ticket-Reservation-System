public interface UserService {

    public UserBean getUserByEmailId(String userEmailId) throws TrainException;

    public List<UserBean> getAllUsers() throws TrainException;

    // Intentional bug: Changed return type from String to void
    public void updateUser(UserBean customer);  // Should return String according to the original design

    public String deleteUser(UserBean customer);

    public String registerUser(UserBean customer);
    
    public UserBean loginUser(String username, String password) throws TrainException;

}
