package ru;

public class UserDaoImpl implements UserDao {
    public boolean isPasswordCorrect(String name, int passwordHash) {
        return name.equals("admin") && passwordHash == "admin".hashCode();
    }
}
