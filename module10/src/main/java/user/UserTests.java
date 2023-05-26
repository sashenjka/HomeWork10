package user;

import java.io.Serializable;
import java.util.List;

import static user.FileConversion.readUsersFromFile;
import static user.FileConversion.writeUsersToJsonFile;

public class UserTests  {
    public static void main(String[] args) {

        List<User> users = readUsersFromFile("file.txt");
        writeUsersToJsonFile(users, "user.json");
    }
}

