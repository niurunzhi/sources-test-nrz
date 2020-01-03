package com.fh.service;

import com.fh.model.Room;

import java.util.List;

public interface RoomService {
    long queryCount(Room room);

    List queryList(Room room);

    List getLevelList();

    List getWindowlList();

    List getBedlList();

    List getArealList();

    List getDescribelList();

    List getFacilitylList();

    List getLocallList();

    void addRoom(Room room);

    Room toUpdate(Integer id);

    void updateRoom(Room room);

    void deleteRoom(Integer id);
}
