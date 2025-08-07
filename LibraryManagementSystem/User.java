package Solution;

public class User {

	private String name;
    private int userId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    
	
	
	public User(String name, int userId) {
		super();
		this.name = name;
		this.userId = userId;
	}
	
	@Override
    public String toString() {
        return name + " (User ID: " + userId + ")";
    }
	
}
