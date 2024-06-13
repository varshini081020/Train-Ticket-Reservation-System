public interface UserService {

    public UserBean getUserByEmailId(String userEmailId) throws TrainException;

    public List<UserBean> getAllUsers() throws TrainException;

    public String updateUser(UserBean customer);

    public String deleteUser(UserBean customer);

    public String registerUser(UserBean customer);
    
    public UserBean loginUser(String username, String password) throws TrainException;

    // Deliberate bug: Method with incorrect return type
    public int incorrectMethod();  // Incorrect return type should not be here in interface
}
