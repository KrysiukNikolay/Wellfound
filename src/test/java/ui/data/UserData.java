package ui.data;

import ui.config.ConfigReader;

public class UserData {
    static ConfigReader configReader = new ConfigReader();
    static String userEmail = configReader.getuserEmail();
    static String userPassword = configReader.getUserPassword();

    public static final String USER_EMAIL = userEmail;
    public static String[] parts = USER_EMAIL.split("@");
    public static String username = parts[0].replace(".", "_");
    public static final String USER_PASSWORD = userPassword;
    public static final String COMMENTS = "Excellent attitude of the doctor to his work. You can immediately see the professional and the master. After the first visit to the doctor, I felt relief and a decrease in neck pain. After each session, the lightness in the back increased. Neck mobility has become much better and more pleasant. I thank Olimjon for his excellent human qualities and high professionalism!";

}
