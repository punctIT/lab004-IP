package ro.emag.auth;

public class Admin {
    private int id;
    private String permissions;
    private int userId;
    private User user;

    public Admin() {}

    public Admin(int id, String permissions, int userId) {
        this.id = id;
        this.permissions = permissions;
        this.userId = userId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getPermissions() { return permissions; }
    public void setPermissions(String permissions) { this.permissions = permissions; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public boolean hasPermission(String permission) { return false; }

    @Override
    public String toString() {
        return "Admin{id=" + id + ", permissions=" + permissions + "}";
    }
}
