import java.util.Arrays;

public class MyList<E> {
    //size xác định số phần tử trong danh sách, mặc định gán là 0.
    private int size =0;
    //DEFAULT_CAPACITY lưu số phần tử đối đa trong danh sách mặc định là 10.
    private static final int DEFAULT_CAPACITY =10;
    //Mảng đối tượng elements chứa các phần tử trong danh sách
    private Object elements[];
    //Phương thức khởi tạo không tham số
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    //tang gap doi kich thuoc mang.
    private void ensureCapa(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }
    //them phan tu vao cuoi mang
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] =e;
    }
    //phuong thuc get tra ve phan tu thu i trong danh sach.
    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: "+i+", size");
        }
        return (E) elements[i];
    }


}
