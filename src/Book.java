/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 13:42
 * Filename : Book
 */

// Khởi tạo class Book Kế thừa class Dictionary
// Nhưng ở đây hai kiểu tham số được xác định sẵn là Integer và String
public class Book extends Dictionary<Integer,String>{

    public Book(Integer key, String value) {
        super(key, value);
    }
}

//Tạo một class dùng để test các Examples
class BookExercise{
    // Tạo phương thức Exercise
    public static void Exercise(){
        // Khởi tạo một biến từ class Book, ở đây vì đã được set sẵn kiểu tham số
        // nên sẽ không cần truyền vào các kiểu tham số như Dictionary nữa
        Book book1 = new Book(1,"Dac Nhan Tam");
        Integer key = book1.getKey();
        String value = book1.getValue();
        System.out.println("Book "+key+": "+value);
    }
}
