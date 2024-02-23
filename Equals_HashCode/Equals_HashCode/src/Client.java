public class Client {
    private int id;

    public Client(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this!=obj)
            return false;
        if (obj==null)
            return false;
        if (getClass()!=obj.getClass())
            return false;
        Client other =(Client) obj;
        if (id!=((Client) obj).id)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
