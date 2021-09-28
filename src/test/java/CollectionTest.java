import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionTest {
    @Test
    public void arrayList(){
        ArrayList<String> values = new ArrayList<String>();
        values.add("first");
        values.add("second");
        assertThat(values.add("three")).isTrue();
        assertThat(values.size()).isEqualTo(3);
        assertThat(values.get(0)).isEqualTo("first");
        assertThat(values.contains("second")).isTrue();
        assertThat(values.remove(0)).isEqualTo("first");
        assertThat(values.size()).isEqualTo(2);
    }

    @Test
    public void deque(){
        Deque<Integer> que = new ArrayDeque<>();
        que.add(1);
        que.add(2);
        que.add(3);
        assertThat(que.poll()).isEqualTo(1);//맨 앞에 있는 원소 반환. 삭제 O
        assertThat(que.size()).isEqualTo(2);
        assertThat(que.peek()).isEqualTo(2);//맨 앞에 있는 원소 반환. 삭제 X
        assertThat(que.size()).isEqualTo(2);
    }
}
