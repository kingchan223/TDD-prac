/*primitive type을 클래스로 감싸기*/
public class Positive{

    private int number;

    public Positive(String value){
        this(Integer.parseInt(value));
    }

    public Positive(int number){
        if(number<0) throw new RuntimeException("값이 음수입니다.");
        this.number = number;
    }

    public Positive add(Positive other) {
        return new Positive(this.number + other.number);
    }

    public int getNumber() {
        return number;
    }
}
