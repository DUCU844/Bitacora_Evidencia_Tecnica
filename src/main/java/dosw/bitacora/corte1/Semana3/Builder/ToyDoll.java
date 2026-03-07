package dosw.bitacora.Semana3.Builder;

public class ToyDoll {
    private String head;
    private String body;
    private String arms;
    private String legs;
    private boolean hasAccessories;

    public void setHead(String head) {
        this.head = head;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setArms(String arms) {
        this.arms = arms;
    }
    public void setLegs(String legs) {
        this.legs = legs;
    }
    public void setHasAccessories(boolean hasAccessories) {
        this.hasAccessories = hasAccessories;
    }
    public void showInfo(){
        System.out.println("Head: " + head);
        System.out.println("Body: " + body);
        System.out.println("Arms: " + arms);
        System.out.println("Legs: " + legs);
        System.out.println("Has accessories: " + hasAccessories);
    }
}
