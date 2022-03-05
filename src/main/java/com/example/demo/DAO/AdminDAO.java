package com.example.demo.DAO;

public interface AdminDAO {
    class User {
        private Integer ID;
        private String username;
        private String name;
        private Boolean isManager;
        private String password;

        public User(Integer ID, String username, String name, Boolean isManager, String password) {
            this.ID = ID;
            this.username = username;
            this.name = name;
            this.isManager = isManager;
            this.password = password;
        }

        public Integer getID() {
            return ID;
        }

        public void setID(Integer ID) {
            this.ID = ID;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getManager() {
            return isManager;
        }

        public void setManager(Boolean manager) {
            isManager = manager;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "User{" +
                    "ID=" + ID +
                    ", username='" + username + '\'' +
                    ", name='" + name + '\'' +
                    ", isManager=" + isManager +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
