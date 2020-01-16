public interface Lockable{
  public boolean isLocked();
  public void setKey(int newKey);
  public void lock(int key);
  public void unlock(int key);
}
