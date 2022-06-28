/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 13:38
 * Filename : Dictionary
 */
// Khởi tạo một class Generic chứa một cặp key/values
public class Dictionary<K,V> {
    private K key;
    private V value;

    // Tạo Constructor cho class
    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }


    // Tạo phương thức getter và setter cho class
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

// Tạo một class để thực hiện các Examples
class DictionaryExercise{
    public static void exercise(){
        // Vì K và V được gọi là một kiểu tham số chiếu nào đó của Class Dictionary<K,V>
        // Nên khi sử dụng class này ta phải xác định một kiểu tham số cụ thể
        // Ở đây là String và String
        Dictionary<String, String> dictionary = new Dictionary<>("Learn","hoc");
        String eng = dictionary.getKey();
        String vietnamese = dictionary.getValue();
        System.out.println(eng +": "+vietnamese);
    }
}

