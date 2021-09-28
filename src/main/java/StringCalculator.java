
public class StringCalculator {

    public static int splitAndSum(String text){
        if(isBlank(text)) return 0;
        return sum(toPositives(split(text)));
    }

    public static int sum(Positive[] numbers){//메소드가 한가지 일만 하도록 한다.
        Positive result = new Positive(0);
        for (Positive number : numbers)
            result = result.add(number);
        return result.getNumber();
    }
    public static Positive[] toPositives(String[] values){
        Positive[] numbers = new Positive[values.length];
        for(int i=0; i<values.length;i++)
            numbers[i] = new Positive(values[i]);
        return numbers;
    }

    public static String[] split(String text){
        return text.split(",|:");
    }

    public static boolean isBlank(String text){
        return text==null || text.isEmpty();
    }
}





/*로또, 사다리, 볼링 점수판, 체스, 지뢰찾기로 리팩토링, TDD연습 해보기.*/

/*
* < 객체지향 생활체조 원칙 >
* 1. 한 메서드에 오직 한 단계의 들여쓰기만 한다.
* 2. else 예약어를 쓰지 않는다.
* 3. 모든 원시값과 문자열을 포장한다.(class로)
* 4. 한 줄에 점을 하나만 찍는다.
*
* 5. 줄여쓰지 않는다.
* 6. 모든 엔티티를 작게 유지한다.
* 7. 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
* 8. 일급 컬렉션을 쓴다.
* 9. getter, setter, 프로퍼티를 쓰지 않는다.
*
* < 메소드 인자 개수 >
* 메소드에서 가장 이상적인 인자 개수는 0개이다. 그다음은 1개, 그 다음은 2. 3개는 가능하면 피하고, 4개이상은 절대 사용 X
* */


