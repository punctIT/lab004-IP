package ro.emag.catalog;

import ro.emag.auth.User;
import java.time.LocalDateTime;

public class CatalogManager {
    private int id;
    private int userId;
    private String lastSearch;
    private String lastFilter;
    private LocalDateTime lastAccessed;
    private User user;

    public CatalogManager() {}

    public CatalogManager(int id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getLastSearch() { return lastSearch; }
    public void setLastSearch(String lastSearch) { this.lastSearch = lastSearch; }
    public String getLastFilter() { return lastFilter; }
    public void setLastFilter(String lastFilter) { this.lastFilter = lastFilter; }
    public LocalDateTime getLastAccessed() { return lastAccessed; }
    public void setLastAccessed(LocalDateTime lastAccessed) { this.lastAccessed = lastAccessed; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public void updateLastAccess() {}

    @Override
    public String toString() {
        return "CatalogManager{id=" + id + ", userId=" + userId + "}";
    }
}
