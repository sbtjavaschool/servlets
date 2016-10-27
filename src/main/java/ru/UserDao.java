package ru;

public interface UserDao {
    boolean isPasswordCorrect(String name, int password);
}
