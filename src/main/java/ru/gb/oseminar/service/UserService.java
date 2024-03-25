package ru.gb.oseminar.service;

import java.time.LocalDate;
import java.util.List;

import ru.gb.oseminar.data.User;

public interface UserService<T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
