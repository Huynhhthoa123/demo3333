package com.Demoverse.Services;

import com.Demoverse.Database.ConnectDB;
import com.Demoverse.Entities.Users;
import com.Demoverse.Services.Interface.*;

import java.sql.Connection;

public class AppServices {
    public IBlockList blockList;
    public IDeatailRoom deatailRoom;
    public IRoom room;
    public IThongKe thongKe;
    public ITypeRoom typeRoom;
    public IUsers users;
    public Connection connection;
    public AppServices()
    {
        this.connection = ConnectDB.getConnect();
        this.blockList = new BlockListService(this.connection);
        this.deatailRoom = new DetailRoomService(this.connection);
        this.thongKe = new ThongKeService(this.connection);
        this.room = new RoomService(this.connection);
        this.users = new UsersService(this.connection);
        this.typeRoom = new TypeRoomService(this.connection);
    }
    public void addUser(Users user)
    {
        Boolean bool = users.find(user.getEmail());
        if(!bool)
            users.add(user);
        else
            System.out.println("xxx");
    }
    public void deleteUser(Users user)
    {
        Boolean bool = users.find(user.getEmail());
        if(bool)
        users.delete(user);
        else
            System.out.println("xxx");
    }

    public void updateUser (Users user)
    {
        Boolean bool = users.find(user.getEmail());
        if(bool)
            users.update(user);
        else
            System.out.println("xxx");
    }
    public List<Users>
    public void Close() {
        try {
            this.connection.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
