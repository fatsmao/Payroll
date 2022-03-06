package com.example.demo.Service;

import com.example.demo.DAO.AdminDAO;
import com.example.demo.POJO.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminDAO adminDAO;

    public AdminService(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    private boolean adminExists(Integer id) {
        return adminDAO
                .listAdmin()
                .stream()
                .anyMatch(user -> user.getID().equals(id));
    }

    private boolean isSecurePassword(String password) {

        boolean hasLetter = false;
        boolean hasDigit = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {
                    hasLetter = true;
                } else if (Character.isDigit(x)) {
                    hasDigit = true;
                }

                if (hasLetter && hasDigit) {
                    return true;
                }
            }

        } else {
            throw new IllegalStateException("Your password must have at least 8 characters");
        }
        return false;
    }

    public void addAdmin(Admin admin) {
        boolean exists = adminExists(admin.getID());
        boolean secure = isSecurePassword(admin.getPassword());
        if (exists) {
            throw new IllegalStateException("Admin user already exists");
        } else if (admin.getName() == null) {
            throw new IllegalStateException("No name entered.");
        } else if (admin.getUsername() == null) {
            throw new IllegalStateException("No username entered");
        } else if (admin.getPassword() == null) {
            throw new IllegalStateException("No password entered");
        } else if (!secure) {
            throw new IllegalStateException("Password not secure");
        } else if (admin.getIsAdmin()) {
            throw new IllegalStateException("Manager already exists.");
        } else {
            adminDAO.addAdmin(admin);
        }
    }

    public void deleteAdmin(Integer Id) {
        boolean exists = adminExists(Id);
        if (!exists) {
            throw new IllegalStateException("Admin user does not exist");
        } else {
            adminDAO.deleteAdmin(Id);
        }
    }

    public void updateAdmin(Admin admin) {
        boolean exists = adminExists(admin.getID());

        int result = adminDAO.updateAdmin(admin);

        if (result != 1) { //if result isn't one then you know that something failed.
            throw new IllegalStateException("Could not update user in database. Input not valid");
        }
    }

    public List<Admin> displayAdmin() {
        return adminDAO.listAdmin();
    }

}

//    int addAdmin (Admin admin);
//    List<Admin> listAdmin();
//    int deleteAdmin(Integer id);
//    int updateAdmin(Admin admin);