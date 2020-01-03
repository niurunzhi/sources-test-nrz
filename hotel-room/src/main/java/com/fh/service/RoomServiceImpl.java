package com.fh.service;


import com.fh.mapper.RoomMapper;
import com.fh.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {


    @Autowired
    private RoomMapper roomMapper;

    @Override
    public long queryCount(Room room) {
        return roomMapper.queryCount(room);
    }

    @Override
    public List queryList(Room room) {
        return roomMapper.queryList(room);
    }

    @Override
    public List getLevelList() {
        return roomMapper.getLevelList();
    }

    @Override
    public List getWindowlList() {
        return roomMapper.getWindowlList();
    }

    @Override
    public List getBedlList() {
        return roomMapper.getBedlList();
    }

    @Override
    public List getArealList() {
        return roomMapper.getArealList();
    }

    @Override
    public List getDescribelList() {
        return roomMapper.getDescribelList();
    }

    @Override
    public List getFacilitylList() {
        return roomMapper.getFacilitylList();
    }

    @Override
    public List getLocallList() {
        return roomMapper.getLocallList();
    }

    @Override
    public void addRoom(Room room) {
        roomMapper.addRoom(room);
    }

    @Override
    public Room toUpdate(Integer id) {
        return roomMapper.toUpdate(id);
    }

    @Override
    public void updateRoom(Room room) {
        roomMapper.updateRoom(room);
    }

    @Override
    public void deleteRoom(Integer id) {
        roomMapper.deleteRoom(id);
    }
}
