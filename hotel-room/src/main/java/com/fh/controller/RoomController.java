package com.fh.controller;


import com.fh.common.ServerResponse;
import com.fh.model.Room;
import com.fh.service.RoomService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("room")
@CrossOrigin()
public class RoomController {


    @Autowired
    private RoomService roomService;

    @RequestMapping("addRoom")
    @ResponseBody
    public ServerResponse addRoom(Room room){
        roomService.addRoom(room);
        return ServerResponse.success();
    }

    @RequestMapping("deleteRoom")
    @ResponseBody
    public ServerResponse deleteRoom(Integer id){
        roomService.deleteRoom(id);
        return ServerResponse.success();
    }

    @RequestMapping("updateRoom")
    @ResponseBody
    public ServerResponse updateRoom(Room room){
        roomService.updateRoom(room);
        return ServerResponse.success();
    }

    @RequestMapping("toUpdateRoom")
    @ResponseBody
    public ServerResponse toUpdateRoom( Integer id){
        Room room = roomService.toUpdate(id);
        return ServerResponse.success(room);
    }

    @RequestMapping("queryListAll")
    @ResponseBody
    public ServerResponse queryListAll(Room room){
        List list =  roomService.queryList(room);
        return ServerResponse.success(list);
    }



    @RequestMapping("queryList")
    @ResponseBody
    public ServerResponse queryList(Room room){
        Map map = new HashMap();
        long count = roomService.queryCount(room);
        List list =  roomService.queryList(room);
        map.put("draw", room.getDraw());
        map.put("recordsTotal", count);
        map.put("recordsFiltered", count);
        map.put("data", list);
        return ServerResponse.success(map);
    }


    @RequestMapping("/getLevelList")
    @ResponseBody
    public  ServerResponse getLevelList(){
        List list =  roomService.getLevelList();
        return ServerResponse.success(list);
    }


    @RequestMapping("/getWindowlList")
    @ResponseBody
    public  ServerResponse getWindowlList(){
        List list =  roomService.getWindowlList();
        return ServerResponse.success(list);
    }


    @RequestMapping("/getBedlList")
    @ResponseBody
    public  ServerResponse getBedlList(){
        List list =  roomService.getBedlList();
        return ServerResponse.success(list);
    }

    @RequestMapping("/getArealList")
    @ResponseBody
    public  ServerResponse getArealList(){
        List list =  roomService.getArealList();
        return ServerResponse.success(list);
    }

    @RequestMapping("/getDescribelList")
    @ResponseBody
    public  ServerResponse getDescribelList(){
        List list =  roomService.getDescribelList();
        return ServerResponse.success(list);
    }

    @RequestMapping("/getFacilitylList")
    @ResponseBody
    public  ServerResponse getFacilitylList(){
        List list =  roomService.getFacilitylList();
        return ServerResponse.success(list);
    }


    @RequestMapping("/getLocallList")
    @ResponseBody
    public  ServerResponse getLocallList(){
        List list =  roomService.getLocallList();
        return ServerResponse.success(list);
    }

}
