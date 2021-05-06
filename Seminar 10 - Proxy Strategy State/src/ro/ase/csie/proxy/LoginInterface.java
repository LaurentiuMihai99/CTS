package ro.ase.csie.proxy;

public interface LoginInterface {
	public boolean login(String username, String pass);
	public boolean checkServerStatus();
}
