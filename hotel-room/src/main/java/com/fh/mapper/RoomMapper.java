package com.fh.mapper;


import com.fh.model.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper  {
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
