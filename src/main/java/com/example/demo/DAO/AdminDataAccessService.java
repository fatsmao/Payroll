package com.example.demo.DAO;

import com.example.demo.POJO.Admin;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminDataAccessService implements AdminDAO {

    private final JdbcTemplate jdbcTemplate;

    public AdminDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAdmin(Admin admin) {
        String sql = """
        INSERT INTO admin (isAdmin, name, username, password)
        VALUES (?, ?, ?, ?)
        """;
        int adminFields = jdbcTemplate.update(sql,
                admin.getIsAdmin(),
                admin.getName(),
                admin.getUsername(),
                admin.getPassword());
        return adminFields;
    }

    @Override
    public List<Admin> listAdmin() {
        String sql = """
        SELECT isAdmin, name, username, id
        FROM admin
        """;
        RowMapper<Admin> adminRowMapper = (rs, rowNum) -> {
            Admin admin = new Admin(
                    rs.getBoolean("isAdmin"),
                    rs.getString("name"),
                    rs.getString("username"),
                    rs.getInt("id")
            );
            return admin;
        };
        List<Admin> admin = jdbcTemplate.query(sql, adminRowMapper);
        return admin;
    }

    @Override
    public int deleteAdmin(Integer id) {
        String sql = """
         DELETE FROM admin
         WHERE id = ?
         """;
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateAdmin(Admin admin) {
        String sql = """
        UPDATE admin
        SET(isAdmin, name, username, password) = (?, ?, ?, ?)
        WHERE user_id = ?
        """;
        return jdbcTemplate.update(
                sql,
                admin.getIsAdmin(),
                admin.getName(),
                admin.getUsername(),
                admin.getPassword()
        );
    }
}
