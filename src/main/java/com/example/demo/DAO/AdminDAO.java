package com.example.demo.DAO;

import com.example.demo.POJO.Admin;

import java.util.List;

public interface AdminDAO {
   int addAdmin (Admin admin);
   List<Admin> listAdmin();
   int deleteAdmin(Integer id);
   int updateAdmin(Admin admin);
}
