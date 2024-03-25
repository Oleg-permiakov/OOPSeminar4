package ru.gb.oseminar.view;

import ru.gb.oseminar.data.User;

public class TeacherVieW <T extends User> {
    
    Logger logger = Logger.getLogger(TeacherVieW.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }

}