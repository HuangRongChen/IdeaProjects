package chap007;

public class Mobile {

    public String name;
    public double monney;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getMonney() {
        return this.monney;
    }

    public void setMonney(double monney) {
        this.monney = this.monney + monney;
        return;
    }



/*    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
*/

    public void sound() {
        System.out.println(this.name + "手机闹铃响起了");
    }

    public double addSize(double size) {
        this.monney = this.monney + size;
        return (this.monney += size);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        System.out.println(mobile1.getName());

        mobile1.setName("小米");
        System.out.println(mobile1.getName());

        Mobile mobile2 = new Mobile();
        mobile2.setName("华为");

        Mobile mobile3 = new Mobile();
        mobile3.setName("苹果");
//        mobile3.setColor("白色");
        mobile3.setMonney(9);

//        System.out.println(mobile3.getName() + ", "
//        + mobile3.getColor() + ", "
//        + mobile3.getMonney() + ", "
//        + mobile3.getCpu());
    }

}
